package week15;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HguParkingManager {
    List<HguCar> carList = null;
    List<HguUser> userList = null;
    List<HguInOut> inOutList = null;

    public HguParkingManager(){
        carList = new ArrayList<>();
        List<String> aList = dataFileIn("car");
        for(String s : aList){
            HguCar each = new HguCar(s);
            carList.add(each);
        }
        userList = new ArrayList<>();
        aList = dataFileIn("user");
        for(String s : aList){
            HguUser each = new HguUser(s);
            userList.add(each);
        }
        inOutList = new ArrayList<>();
        aList = dataFileIn("inout");
        for(String s : aList){
            HguInOut each = new HguInOut(s);
            inOutList.add(each);
        }
    }

    public List<String> dataFileIn(String fileName){
        List<String> dataList = new ArrayList<>();
        try{
            File file = new File("./src/week15/"+fileName+".txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                //System.out.println(scanner.nextLine());
                String each = scanner.nextLine();
                dataList.add(each);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dataList;
    }
    public void dataFileOut(String fileName){
        String datas = "";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./src/week15/"+fileName+".txt");
            switch(fileName){
                case "car": {
                    for (HguCar each : carList) {
                        datas += each.toString() + "\n";
                    }
                } break;
                case "user": {
                    for (HguUser each : userList) {
                        datas += each.toString() + "\n";
                    }
                } break;
                case "inout": {
                    for (HguInOut each : inOutList) {
                        datas += each.toString() + "\n";
                    }
                } break;
            }

            byte b[] = datas.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean containsCar(HguCar each){
        for(HguCar car : carList){
            if((car.getCarNum()).equals(each.getCarNum())){
                return true;
            }
        }
        return false;
    }
    public void addCar(HguCar each){
        if(containsCar(each)){
            System.out.println("this car already exist");
        } else {
            if(checkUserId(each.getUserId())){
                carList.add(each);
                dataFileOut("car");
            } else {
                System.out.println("userId does not exist");
            }
        }
    }

    public boolean checkUserId(String userId){
        for(HguUser user : userList){
            if(userId.equals(user.getUserId())){
                return true;
            }
        }
        return false;
    }
    public boolean containsUser(HguUser each){
        for(HguUser user : userList){
            if((user.getPhone()).equals(each.getPhone())){
                return true;
                /*
                if((user.getName()).equals(each.getName())){
                    return true;
                }
                */
            }
        }
        return false;
    }
    public void addUser(HguUser each){
        if(containsUser(each)){
        } else {
            each.setUserId((userList.size() + 1) + "");
            userList.add(each);
            dataFileOut("user");
        }
    }

    public HguInOut lastInOut(String carNum){
        HguInOut each = null;
        for(HguInOut inOut : inOutList){
            if((inOut.getCarNum()).equals(carNum)){
                each = inOut;
            }
        }
        return each;
    }
    public void addInOut(HguInOut each){
        HguInOut temp = lastInOut(each.getCarNum());

        Date now = new Date();
        SimpleDateFormat sDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //format2 = new SimpleDateFormat("''yy년 MM월 dd일 E요일",Locale.KOREAN);

        String dateTime = sDateTime.format(now);
        //System.out.println(dateTime);
        String[] arrayData = dateTime.split(" ");
        each.setNowDate(arrayData[0]);
        each.setNowTime(arrayData[1]);

        if("in".equals(each.getType())){
            //새로 입력하는 정보가 입차일때!
            if(temp == null || (temp.getType()).equals("out")){
                //오직 입차만 가능!
                inOutList.add(each);
                dataFileOut("inout");
            } else {
                System.out.println("car already in");
            }
        } else {
            //새로 입력하는 정보가 출차일때
            if((temp.getType()).equals("in")){
                //주차 시간을 계산해주자!
                String inDate = temp.getNowDate();
                String inTime = temp.getNowTime();

                try{
                    Date before = sDateTime.parse(inDate + " " + inTime);

                    // Date -> 밀리세컨즈
                    long timeMil1 = before.getTime();
                    long timeMil2 = now.getTime();

                    // 비교
                    long diff = timeMil2 - timeMil1;
                    long diffSec = diff / 1000;
                    long diffMin = diff / (1000 * 60);

                    diffMin = diff / (1000);

                    HguOut out = new HguOut(each.getCarNum() + " "
                            + each.getType() + " " + each.getNowDate()
                            + " " + each.getNowTime());
                    int price = 20;
                    int minute = (int)diffMin;

                    out.setFee(price * minute);
                    out.setParkingTime(minute);

                    each = out;
                } catch (Exception e){

                }

                //오직 출차만 가능!
                inOutList.add(each);
                dataFileOut("inout");
            } else {
                System.out.println("car already out");
            }
        }
    }
}
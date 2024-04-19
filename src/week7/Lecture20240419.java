package week7;

import java.util.Scanner;

public class Lecture20240419 {
    public static void main(String[] args) {
        Lecture20240419 pStudio = new Lecture20240419();
        pStudio.practice001();
        //pStudio.practice002();
    }

    int countThis(int type, String str){
        //type 숫자0 대문자1 소문자2 기호3
        int[] returnVal = {0,0,0,0};
        for(int i=0;i<str.length();i++){
            int each = str.charAt(i);
            //System.out.println(each);
            if(each >= 48 && each <= 57){
                //숫자
                returnVal[0]++;
            }
            if(each >= 65 && each <= 90){
                //대문자
                returnVal[1]++;
            }
            if(each >= 97 && each <= 122){
                //소문자
                returnVal[2]++;
            }
            String eachString = str.substring(i, i+1);
            if(
                    eachString.contains("!")
                    || eachString.contains("_")
                    || eachString.contains("&")
            ){
                //기호
                returnVal[3]++;
            }
        }
        return returnVal[type];
    }

    void practice001(){
        String userId;
        String password;
        String name;

        Scanner in = new Scanner(System.in);

        /*
        System.out.print("id: ");
        userId = in.next();
        System.out.print("password: ");
        password = in.next();
        */
        while(true){
            System.out.print("id: ");
            userId = in.next();
            int countSmallA = countThis(2, userId); //소문자 개수
            int countNum = countThis(0, userId); //숫자 개수
            if(
                    countSmallA > 0
                    && countNum > 0
                    && countSmallA + countNum == userId.length()
            ){
                break;
            } else {
                System.out.println("not enough");
            }
        }
        while(true){
            System.out.print("password: ");
            password = in.next();

            int countSmallA = countThis(2, password);
            int countBigA = countThis(1, password);
            int countNum = countThis(0, password);
            int countE = countThis(3, password);
            if(
                    countSmallA > 0
                            && countBigA > 0
                            && countNum > 0
                            && countE > 0
                            && countSmallA + countBigA + countNum + countE == password.length()
            ){
                break;
            } else {
                System.out.println("not enough");
            }

            /*
            if(password.length() <= 3){
                System.out.println("password is too short");
            } else {
                break;
            }

             */
        }
        String pwPrint = password.substring(0, password.length() - 3) + "***";
        String pwPrint2 = "";
        for(int i=0;i<password.length();i++){
            if(i%2 != 0){
                pwPrint2 += password.substring(i, i+1);
            } else {
                pwPrint2 += "*";
            }
        }

        System.out.print("name: ");
        name = in.next();

        System.out.println("userId : " + userId);
        System.out.println("password : " + password);
        System.out.println("pwPrint : " + pwPrint);
        System.out.println("pwPrint2 : " + pwPrint2);
        System.out.println("name : " + name);
    }
    // 1) 비밀번호 홀수 자리만 *로 변경해서 출력하는 것 
    // 2) 영문 소문자와 숫자로 이루어진 아이디를 받을 것
    // 3) 영문자 대문사, 소문자, 숫자, 그리고 ! _ & 가 포함된 비밀번호를 받을것

    void practice002(){
        String str = "0123456789";
        System.out.println(str.substring(1,6));
        System.out.println(str.substring(5,str.length()));
        System.out.println(str.length());

        if(str.contains("!")){

        }
        if(str.indexOf("!") > -1){

        }
        String each = "a";
        if("a".equals(each)){

        }
        if(each.equals("a")){

        }

        String today = "2024-04-19";
        String[] arrayDate = today.split("-");
        String today8 = today.replaceAll("-",""); //20240419
        today8 = arrayDate[0] + arrayDate[1] + arrayDate[2];

        int todayNum = Integer.parseInt(today8);
        //double = Double



    }
}
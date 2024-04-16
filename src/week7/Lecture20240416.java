package week7;

import java.util.Scanner;

public class Lecture20240416 {
    public static void main(String[] args) {
        Lecture20240416 pStudio = new Lecture20240416();
        //pStudio.digitalClock();
        pStudio.practice002();
    }

    //기본 버젼
    void digitalClock(){

        /*
        시와 분을 입력받고, 00:00~ 해당 시간까지
        3이 보이는 순간의 회수를 구해주세요!
         */

        int hour;
        int minute;
        int count = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("hour: ");
        hour = in.nextInt();
        System.out.print("minute: ");
        minute = in.nextInt();

        for(int i=0;i<=hour;i++){
            int target_j = 59;
            if(i==hour){
                target_j = minute;
            }
            for(int j=0;j<=target_j;j++) {
                String tempij = i+":"+j;
                if(tempij.indexOf("3")>-1){
                    count++;
                }
                if(
                        i/10 == 3 || i%10 ==3
                        || j/10 == 3 || j%10 ==3
                ){
                    //count++;
                }
                //System.out.println(i + ":" + j);
            }
        }

        System.out.println("count:" + count);
    }
    void practice001(){
        //indexOf

        String str = "1234567890";
        System.out.println(str);
        int indexOf3 = str.indexOf("3"); //2
        int indexOfa = str.indexOf("a"); //-1
        //System.out.println(str.contains("3") + "!!");
        //System.out.println(str.contains("a") + "!!!");

        String tempDate = "2024-04-16";
        String[] arrayDate = tempDate.split("-");
        System.out.println("arrayDate0 : " + arrayDate[0]);
        System.out.println("arrayDate1 : " + arrayDate[1]);
        System.out.println("arrayDate2 : " + arrayDate[2]);

        String sYear = tempDate.substring(0,4);
        String sMonth = tempDate.substring(5,7);
        String sDay = tempDate.substring(8,10);
        int year = Integer.parseInt(arrayDate[0]);
        int month = Integer.parseInt(arrayDate[1]);
        int day = Integer.parseInt(arrayDate[2]);

        int yearMonthDay = 20240416;
        String sYearMonthDay = sYear + sMonth + sDay;

        sYearMonthDay = tempDate.replaceAll("-", "");
        System.out.println("sYearMonthDay : " + sYearMonthDay);

        yearMonthDay = Integer.parseInt(sYearMonthDay);

    }
    void practice002(){

        String str = "1234567890";
        System.out.println(str);

        String strFirst3 = str.substring(0,3);
        System.out.println(strFirst3);
        String strDeleteLast3 = str.substring(0,str.length()-3);
        System.out.println(strDeleteLast3);

        String strLast3 = str.substring(str.length()-3,str.length());
        System.out.println(strLast3);

        String tempDate = "2024-04-16";
        String[] arrayDate = tempDate.split("-");
        String year = tempDate.substring(0,4);
        String month = tempDate.substring(5,7);
        String day = tempDate.substring(8,10);
        String year1 = arrayDate[0];
        String month1 = arrayDate[1];
        String day1 = arrayDate[2];

        String ymd = tempDate.replaceAll("-", "");
        int intYmd = 20240416;
        intYmd = Integer.parseInt(ymd);

        ymd = intYmd + "";
    }
}
package week6;

import java.util.Scanner;

public class Lecture20240412 {
    public static void main(String[] args) {
        Lecture20240412 pStudio = new Lecture20240412();
        pStudio.JQuiz1_1();
    }

    void JQuiz1_1(){
        //전자시계 / 시와 분을 입력해서
        //4가 총 몇번 나오는지 확인해봅시다.
        int checkNumber;
        int count = 0;
        int count1 = 0;
        int hour, minute;
        Scanner in = new Scanner(System.in);
        System.out.print("check number: ");
        checkNumber = in.nextInt();
        System.out.print("hour: ");
        hour = in.nextInt();
        System.out.print("minute: ");
        minute = in.nextInt();

        for(int i=0;i<=hour;i++){
            int endMinute = 59;
            if(i==hour){
                endMinute = minute;
            }
            for(int j=0;j<=endMinute;j++){
                if(i/10 == checkNumber){count++;}
                if(i%10 == checkNumber){count++;}
                if(j/10 == checkNumber){count++;}
                if(j%10 == checkNumber){count++;}

                String hourmin = i + "" + j;
                for(int t=0;t<hourmin.length();t++){
                    String each = hourmin.substring(t, t+1);
                    if(each.equals(checkNumber + "")){
                        count1++;
                    }
                }
            }
        }
        System.out.println("count : " + count);
        System.out.println("count1 : " + count1);
    }
    void JQuiz1(){

        //시와 분을 입력 받고,
        //7이 들어가는 모든 순간의 갯수 (분) 을 구하시오
        //00시00분~ 입력받은 시간까지!!

        int hour,minute;
        int check_num = 7;
        int sum = 0;

        System.out.print("시를 입력하세요(0~23) : ");
        Scanner in = new Scanner(System.in);
        hour = in.nextInt();
        System.out.print("분을 입력하세요(0~59) : ");
        minute = in.nextInt();

        for(int i=0;i<=hour;i++){
            for(int j=0;j<=59;j++){
                //System.out.println("시 : " + i + "//분 : " + j);
                if(i%10 == check_num || i/10 == check_num
                || j%10 == check_num || j/10 == check_num
                ){
                    sum++;
                }
                String tempTime = i + ":" + j;
                if(tempTime.contains("7")){
                    //sum++;
                }
                if(tempTime.indexOf("7") > -1){
                    //sum++;
                }
                if(i == hour && j == minute){
                    break;
                }
            }
        }
        System.out.println("sum : " + sum);
    }
}
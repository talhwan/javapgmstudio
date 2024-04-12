package week6;

import java.util.Scanner;

public class Lecture20240412 {
    public static void main(String[] args) {
        Lecture20240412 pStudio = new Lecture20240412();
        pStudio.JQuiz1();
    }

    void JQuiz1(){

        //시와 분을 입력 받고,
        //7이 들어가는 모든 순간의 갯수 (분) 을 구하시오
        //00시00분~ 입력받은 시간까지!!
        //String 함수는 사용하지 않기로 함!

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
package week6;

import java.util.Scanner;
public class Lecture20240409 {
    public static void main(String[] args) {
        Lecture20240409 pStudio = new Lecture20240409();
        pStudio.Jtest();
    }

    void Jtest() {
        int num1,num2;
        int check_num = 7;
        int sum = 0;
        int sum2 = 0;
        System.out.print("시를 입력하세요(0~23) : ");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        System.out.print("분을 입력하세요(0~59) : ");
        num2 = in.nextInt();

        //
        for(int i=0;i<=num1;i++){
            int target_num = 59;
            if(i == num1){
                target_num = num2;
            }
            for(int j=0;j<=target_num;j++){
                String timer = i + "" + j;
                if(timer.indexOf(check_num + "") > -1){
                    sum++;
                }
                if(i / 10 == check_num || i % 10 ==check_num
                || j / 10 == check_num || j % 10 ==check_num
                ){
                    sum2++;
                }
            }
        }
        System.out.println("sum : " + sum);
        System.out.println("sum2 : " + sum2);
    }
}
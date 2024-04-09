package week6;

import java.util.Scanner;
public class Lecture20240409 {
    public static void main(String[] args) {
        Lecture20240409 pStudio = new Lecture20240409();
        pStudio.Jtest();
    }

    void Jtest() {
        int num1,num2;
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
                if(timer.indexOf("3") > -1){
                    sum++;
                }
                if(i / 10 == 3 || i % 10 ==3
                || j / 10 == 3 || j % 10 ==3
                ){
                    sum2++;
                }
            }
        }
        System.out.println("sum : " + sum);
        System.out.println("sum2 : " + sum2);
    }
}
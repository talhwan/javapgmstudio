package week5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J005();
    }
    void J001(){
        int height,weight;
        double bmi;
        System.out.print("height(cm): ");
        Scanner in = new Scanner(System.in);
        height = in.nextInt();
        System.out.print("weight(kg): ");
        weight = in.nextInt();

        bmi = weight / (height * 0.01 * height * 0.01);
        System.out.println("bmi : " + bmi);
    }
    void J002(){
        double c_degree;
        double f_degree;
        System.out.print("섭씨 온도 : ");
        Scanner in = new Scanner(System.in);
        c_degree = in.nextDouble();
        f_degree = c_degree * 1.8 + 32;

        System.out.println("f_degree : " + f_degree);

    }

    int calculateDayNum(int month){
        int returnValue = 31;
        switch(month){
            case 2:
                returnValue = 28; break;
            case 4:
            case 6:
            case 9:
            case 11:
                returnValue = 30; break;
            default:
                returnValue = 31; break;
        }
        return returnValue;
    }

    void J005(){
        int month,day;
        int tOrder = 0;

        /*
        //아예 월별 날짜를 선언해보았음.
        //1
        int[] month_num = {31,28,31,30,31,30,31,31,30,31,30,31};
        //int[] month_num = {31,28,31,30,31,30,31,31,30,31,30,31};

        //2
        //각 월별 날짜를 파악해서 배열에 넣음.
        int[] month_num = new int[12];
        for(int i=0;i<12;i++){
            int tempMonth = i+1;
            switch(tempMonth){
                case 2:
                    month_num[i] = 28; break;
                case 4:
                case 6:
                case 9:
                case 11:
                    month_num[i] = 30; break;
                default:
                    month_num[i] = 31; break;
            }
        }
        */

        System.out.print("Month : ");
        Scanner in = new Scanner(System.in);
        month = in.nextInt();
        System.out.print("Day : ");
        day = in.nextInt();

        for(int i=0;i<month-1;i++){
            //tOrder += month_num[i];
            tOrder += calculateDayNum(i + 1);
        }
        tOrder += day;
        System.out.println("");
        System.out.println(month + "/" + day + " : " + tOrder + "!");
    }
}
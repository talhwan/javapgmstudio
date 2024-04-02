package week5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        //pStudio.J001();
        pStudio.J002();
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
}
package week5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J001();
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
}
package week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J021();
    }

    void J021PrintAll(int[] h, int[] w, double[] b, boolean[] f) {
        for(int i=0;i<h.length;i++){
            System.out.println(h[i] + " " +w[i] + " " +b[i] + " " + f[i]);
        }
    }
    void J021PrintAll2(int[][] hw, double[] b, boolean[] f) {
        for(int i=0;i<hw.length;i++){
            System.out.println((i+1) + "//");
            for(int j=0;j<hw[i].length;j++){
                System.out.println(hw[i][j] + " ");
            }
            System.out.println(b[i] + " " + f[i]);
            System.out.println("======================");
        }
    }
    void J021PrintFat(int[] h, int[] w, double[] b, boolean[] f) {
        int total = 0;
        for(int i=0;i<h.length;i++){
            if(f[i]){
                total++;
                System.out.println("!!!FOUND!!!" + (i+1) + "!!!");
                System.out.println((i+1) + " : " + h[i] + " " +w[i] + " " +b[i] + " " + f[i]);
            }
        }
        System.out.println("!!!TOTAL!!!" + (total) + "!!!");
    }
    void J021() {
        //비만인 사람 숫자를 세는 기능
        //몇번째 사람이 비만이었는지도 확인 (문제에는 없는 기능)
        //전체 입력 받은 내용 다 출력해보기 (문제에는 없는 기능)
        int total = 0;
        //int height,weight;
        int people = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("total people(number): ");
        total = in.nextInt();

        int[][] arrayHeightWeight = new int[total][2];
        // = {{0,0}, {0,0}};
        //int[] arrayHeight = new int[total];
        //int[] arrayWeight = null;
        double[] arrayBmi = null;
        boolean[] arrayIsFat = null;
        //arrayHeight = new int[total];
        //arrayWeight = new int[total];
        arrayBmi = new double[total];
        arrayIsFat = new boolean[total];

        for(int i=0;i<total;i++){
            System.out.print("height(cm): ");
            //arrayHeight[i] = in.nextInt();
            arrayHeightWeight[i][0] = in.nextInt();
            System.out.print("weight(kg): ");
            //arrayWeight[i] = in.nextInt();
            arrayHeightWeight[i][1] = in.nextInt();

            //arrayBmi[i] = arrayWeight[i] / (arrayHeight[i] * 0.01 * arrayHeight[i] * 0.01);
            arrayBmi[i] = arrayHeightWeight[i][1] / (arrayHeightWeight[i][0] * 0.01 * arrayHeightWeight[i][0] * 0.01);
            if(arrayBmi[i] > 25){
                people++;
                arrayIsFat[i] = true;
            } else {
                arrayIsFat[i] = false;
            }
            System.out.println("bmi : " + arrayBmi[i]);
            System.out.println("fat? : " + arrayIsFat[i]);
        }
        System.out.println("count : " + people);

        //J021PrintAll(arrayHeight, arrayWeight, arrayBmi, arrayIsFat);
        //J021PrintFat(arrayHeight, arrayWeight, arrayBmi, arrayIsFat);
        J021PrintAll2(arrayHeightWeight, arrayBmi, arrayIsFat);
    }
}
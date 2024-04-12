package week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J021_2();
    }

    //기본 버젼
    //입력 받은 사람들에 대해서 비만인 사람 수를 계산
    void J021() {
        int total = 0;
        int height,weight;
        int people = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("total people(number): ");
        total = in.nextInt();

        for(int i=0;i<total;i++){
            System.out.print("height(cm): ");
            height = in.nextInt();
            System.out.print("weight(kg): ");
            weight = in.nextInt();

            double bmi = weight / (height * 0.01 * height * 0.01);
            if(bmi >= 25){
                people++;
            } else {
            }
            System.out.println("bmi : " + bmi);
        }
        System.out.println("count : " + people);
    }

    //ver2
    // 키와 몸무게를 입력받고, 비만인 사람들이 몇번째 위치 했는지 구해보겠습니다.
    // 마지막으로 전체 입력받은 정보를 모두 출력
    void J021_1() {
        int total = 0;
        int people = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("total people(number): ");
        total = in.nextInt();

        //
        //int[] arrayHeight1 = {0,0,0,1};
        int[] arrayHeight = new int[total];
        int[] arrayWeight = new int[total];
        double[] arrayBmi = null;
        boolean[] arrayIsFat = null;

        arrayBmi = new double[total];
        arrayIsFat = new boolean[total];

        //for(int i=0;i<total;i++){
        for(int i=0;i<arrayHeight.length;i++){
            System.out.print("height(cm): ");
            arrayHeight[i] = in.nextInt();
            System.out.print("weight(kg): ");
            arrayWeight[i] = in.nextInt();

            arrayBmi[i] = arrayWeight[i] / (arrayHeight[i] * 0.01 * arrayHeight[i] * 0.01);
            if(arrayBmi[i] >= 25){
                people++;
                arrayIsFat[i] = true;
            } else {
                arrayIsFat[i] = false;
            }
            System.out.println("bmi : " + arrayBmi[i]);
            System.out.println("fat? : " + arrayIsFat[i]);
        }
        System.out.println("count : " + people);

        J021_1_PrintAll(arrayHeight, arrayWeight, arrayBmi, arrayIsFat);
    }

    void J021_1_PrintAll(int[] h, int[] w, double[] b, boolean[] f) {
        int total = 0;
        for(int i=0;i<h.length;i++){
            System.out.println(h[i] + " " +w[i] + " " +b[i] + " " + f[i]);
            if(f[i]){
                total++;
                System.out.println("!!!FOUND!!!" + (i+1) + "!!!");
            }
        }
        System.out.println("total : " + total);
    }


    void J021_2_PrintAll(int[][] hw, double[] b, boolean[] f) {
        int total = 0;
        for(int i=0;i<hw.length;i++){
            System.out.println((i+1) + "//");
            for(int j=0;j<hw[i].length;j++){
                System.out.println(hw[i][j] + " ");
            }
            System.out.println(b[i] + " " + f[i]);
            if(f[i]){
                total++;
                System.out.println("!!!FOUND!!!" + (i+1) + "!!!");
            }
            System.out.println("======================");
        }
        System.out.println("total : " + total);
    }
    
    //2차원 배열을 선언하여 구해보기
    void J021_2() {
        int total = 0;
        int people = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("total people(number): ");
        total = in.nextInt();

        int[][] arrayHeightWeight = new int[total][2];
        //Object[][] aArray = new Object[total][4];
        //bmi 소수점 2자리까지 반올림한다음에 100 곱해서 인트로 저장?
        //비만이면 1 아니면 0
        /* {
         {0,0}
         ,{0,0}
         ,{0,0}
         ,{0,0}
         ,{0,0}
         };
         */
        double[] arrayBmi = null;
        boolean[] arrayIsFat = null;
        arrayBmi = new double[total];
        arrayIsFat = new boolean[total];

        /*
        int[][] 1개
        double[] 1개
        boolean[] 1개

        다 int 로 선언하고 bmi는 그때그때 계산!
        Object[total][4]
        Integer
        Double
        Boolean
        */
        for(int i=0;i<total;i++){
            System.out.print("height(cm): ");
            arrayHeightWeight[i][0] = in.nextInt();
            System.out.print("weight(kg): ");
            arrayHeightWeight[i][1] = in.nextInt();

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

        J021_2_PrintAll(arrayHeightWeight, arrayBmi, arrayIsFat);
    }
}
package week8;

import java.util.Scanner;

public class JTest1 {
    public static void main(String[] args) {
        JTest1 pStudio = new JTest1();
        pStudio.test3();
    }

    void test1(){
        int num;
        int sum = 0, max = 0, min = 0;
        /*
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        */
        //min = 9999; //9999보다 큰수를 입력했을 경우 => 제대로된 최소값 구하기 어려움
        int i_max = 0, i_min = 0;
        double avg;
        System.out.print("num : ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        int[] arrayInt = new int[num];
        for(int i=0;i<arrayInt.length;i++){
            System.out.print((i+1) + " num : ");
            arrayInt[i] = in.nextInt();
            sum += arrayInt[i];
            if(i == 0){
                max = arrayInt[i];
                min = arrayInt[i];
            } else {
                if(max < arrayInt[i]){
                    max = arrayInt[i];
                    i_max = i;
                }
                if(min > arrayInt[i]){
                    min = arrayInt[i];
                    i_min = i;
                }
            }
        }
        avg = sum / arrayInt.length;
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
        System.out.println("max : " + max + "//" + (i_max+1));
        System.out.println("min : " + min + "//" + (i_min+1));
    }
    String checkWord(String word){
        String returnVal = "s";
        String[][] arrayCheck = {{"s","x","z"},{"ch","sh"}};
        for(int i=0;i<arrayCheck.length;i++){
            for(int j=0;j<arrayCheck[i].length;j++){
                if(
                        i==0 && word.lastIndexOf(arrayCheck[i][j]) == word.length() -1
                    ||
                        i==1 && word.lastIndexOf(arrayCheck[i][j]) == word.length() -2
                ){
                    returnVal = "es";
                }
            }
        }
        return returnVal;
    }
    void test2(){
        String word;
        Scanner in = new Scanner(System.in);

        System.out.print("word: ");
        word = in.next();

        String plusTemp = "s";
        String endCheck = word.substring(word.length() -2, word.length());
        switch(endCheck){
            case "ch":
            case "sh":
            {
                plusTemp = "es";
            }
                break;
            default: break;
        }
        endCheck = word.substring(word.length() -1, word.length());
        switch(endCheck){
            case "s":
            case "x":
            case "z":
            {
                plusTemp = "es";
            }
            break;
            default: break;
        }

        System.out.println("result : " + word + plusTemp);
        System.out.println("result : " + word + checkWord(word));
    }
    void test3(){
        int num1, num2;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("num1 : ");
        num1 = in.nextInt();
        System.out.print("num2 : ");
        num2 = in.nextInt();

        sum = num1 + num2;
        int count = 0;
        int resultVal = 1;
        while(true){
            sum = sum/10;
            if(sum == 0){
                break;
            } else {
                count++;
            }
        }
        for(int i=0;i<count;i++){
            resultVal = resultVal * 10;
        }
        System.out.println("1. resultVal : " + resultVal);
        String resultVal2 = "";
        for(int i=0;i<((num1 + num2)+"").length();i++){
            if(i == 0){
                resultVal2 += "1";
            } else {
                resultVal2 += "0";
            }
        }
        System.out.println("2. resultVal : " + resultVal2);
    }
}
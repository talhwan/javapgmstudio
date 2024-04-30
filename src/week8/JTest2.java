package week8;

import java.util.Scanner;
import java.lang.Math;

public class JTest2 {
    public static void main(String[] args) {
        JTest2 pStudio = new JTest2();
        pStudio.java001();
    }

    void find_max(int[] p){
        int max = 0, max_i = 0;
        for(int i = 0; i < p.length; i++){
            if(max < p[i]){
                max = p[i];
                max_i = i;
            }
        }
        max_i++;

        System.out.println("Max: " + max + " (" + max_i + ")");
    }

    void find_avg(int[] p){
        int sum = 0;
        for(int i = 0; i < p.length; i++){
            sum += p[i];
        }

        double avg = (1.0) * sum / p.length;

        System.out.println("Average: " + avg);
    }

    void find_min(int[] p){
        int min = p[0], min_i = 0;
        for(int i = 0; i < p.length; i++){
            if(min > p[i]){
                min = p[i];
                min_i = i;
            }
        }
        min_i++;

        System.out.println("Min: " + min + " (" + min_i + ")");
    }

    void calculate_sum(int[] p){
        int sum = 0;
        for(int i = 0; i < p.length; i++){
            sum += p[i];
        }

        System.out.println("Sum: " + sum);
    }
    void java001(){
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        int[] numbers=  new int[num];
        for(int i = 0; i < num; i++){
            numbers[i] = input.nextInt();
        }

        calculate_sum(numbers);
        find_avg(numbers);
        find_max(numbers);
        find_min(numbers);
    }

    void test1(){
        int num;
        int count = 0;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("num : ");
            num = in.nextInt();
            if(num >= 3 && num <=18){
                break;
            } else {
                System.out.println("please insert number between 3~18");
            }
        }

        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                for(int t=1;t<=6;t++){
                    if(i+j+t == num){
                        count += 1;
                        System.out.println("" + i + "-" + j + "-" + t);
                    }
                }
            }
        }
        System.out.println("count : " + count);
    }
    void test2(){
        int amount;
        int count = 0;
        int[] arrayCoin = {500, 100, 50, 10, 1};
        int[] usedCoin = {0, 0, 0, 0, 0};
        Scanner in = new Scanner(System.in);
        System.out.print("amount : ");
        amount = in.nextInt();
        for(int i=0;i<arrayCoin.length;i++){
            usedCoin[i] = amount / arrayCoin[i];
            amount = amount % arrayCoin[i];
            count += usedCoin[i];
        }
        for(int i=0;i<usedCoin.length;i++){
            System.out.println(arrayCoin[i] + " * " + usedCoin[i]);
        }
        System.out.println("count : " + count);
    }
    boolean check010(String str){
        boolean returnVal = true;
        if(str.startsWith("010")){

        } else {
            returnVal = false;
        }
        return returnVal;
    }
    boolean checkPhone(String str){
        boolean returnVal = true;
        returnVal = check010(str);
        String[] arrayPhone = str.split("-");
        if(arrayPhone.length == 3){
            for(int i=0;i<arrayPhone.length;i++){
                if(i==0){
                    if(arrayPhone[i].length() != 3){
                        returnVal = false;
                    }
                } else {
                    if(arrayPhone[i].length() != 4){
                        returnVal = false;
                    }
                }
            }
        } else {
            returnVal = false;
        }
        return returnVal;
    }
    boolean checkPhone2(String str){
        if(!check010(str)){
            return false;
        }
        if(str.length() != 13){
            return false;
        }
        for(int i=0;i<str.length();i++){
            String each = str.substring(i, i+1);
            switch(i) {
                case 3:
                case 8:
                    if("-".equals(each)){
                    } else {
                        return false;
                    }
                break;
                default:
                    int eachNum = str.charAt(i);
                    if(eachNum >= 48 && eachNum <= 57){
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
    void test3(){
        String phone;
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("phone: ");
            phone = in.next();
            if(checkPhone(phone)){
                break;
            } else {
                System.out.println("please insert again(Not OK)");
            }
            if(checkPhone2(phone)){
                break;
            } else {
                System.out.println("please insert again(Not OK)");
            }
        }
        System.out.println("0_phone : " + phone);
        System.out.println("1_phone : " + phone.substring(0, phone.length()-4) + "****");

    }

}
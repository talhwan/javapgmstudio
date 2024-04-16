package week7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J032();
    }

    //기본 버젼
    void J031(){
        String userId;
        String password;
        String name;

        Scanner in = new Scanner(System.in);	// Scanner 객체 생성

        System.out.print("id: ");
        userId = in.next();

        while(true){
            System.out.print("password: ");
            password = in.next();
            if(password.length() <= 3){
                System.out.println("password is too short");
            } else {
                break;
            }
        }

        System.out.print("name: ");
        name = in.next();

        String pwPrint = "";
        for(int i=0;i<password.length()-3;i++){
            pwPrint += password.substring(i,i+1);
        }
        pwPrint += "***";

        System.out.println("userId : " + userId);
        System.out.println("password : " + password);
        System.out.println("pwPrint : " + pwPrint);
        System.out.println("name : " + name);
    }

    void J032(){
        String str;
        String reverse = "";
        String reverse2 = "";
        StringBuilder reverseBuilder = new StringBuilder();
        Scanner in = new Scanner(System.in);	// Scanner 객체 생성

        System.out.print("str: ");
        str = in.next();

        for(int i=0;i<str.length();i++){
            int reverse_i = str.length() - 1 - i;
            //reverse += str.substring(reverse_i,reverse_i+1);
            reverse += str.charAt(reverse_i);
            reverseBuilder.append(str.charAt(reverse_i));
        }
        reverse2 = reverseBuilder + "";
        //reverse2 = reverseBuilder.toString();
        System.out.println("str : " + str);
        System.out.println("reverse : " + reverse);
        System.out.println("reverse2 : " + reverse2);
        System.out.println("reverseBuilder : " + reverseBuilder);
    }
}
package week7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J031_1();
        /*
        pStudio.J031_0();
        pStudio.J031();
        pStudio.J032();
         */
    }

    //기본 문제 풀이
    void J031_0(){
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

        String pwPrint = "";
        String pwPrint1 = "";
        String pwPrint2 = "";
        pwPrint = password.substring(0 ,password.length()-3) + "***";
        for(int i=0;i<password.length()-3;i++){
            pwPrint1 += password.substring(i,i+1);
        }
        pwPrint1 += "***";

        for(int i=0;i<password.length();i++){
            if(i<password.length() -3){
                pwPrint2 += password.substring(i,i+1);
            } else {
                pwPrint2 += "*";
            }
        }

        System.out.print("name: ");
        name = in.next();

        System.out.println("userId : " + userId);
        System.out.println("password : " + password);
        System.out.println("pwPrint : " + pwPrint);
        System.out.println("pwPrint1 : " + pwPrint1);
        System.out.println("pwPrint2 : " + pwPrint2);
        System.out.println("name : " + name);
    }

    // 아이디가 영문과 숫자로 이루어져 있는지 여부 판단
    // 대문자 영문, 소문자 영문, 숫자로 이루어져 있도록 (아이디, 비밀번호 조건)
    // 첫글자는 무조건 영문이어야만 합니다!! (아이디, 비밀번호 조건)
    // ! _ & 3개 기호 중에 하나를 꼭 포함하도록 (비밀번호 조건)
    int[] checkId(String str){
        int[] returnVal = {0,0,0,0,0};
        for(int i=0;i<str.length();i++){
            int each = str.charAt(i);
            //System.out.println(each);
            if(each >= 48 && each <= 57){
                //숫자
                returnVal[0]++;
            }
            if(each >= 65 && each <= 90){
                //대문자
                returnVal[1]++;
            }
            if(each >= 97 && each <= 122){
                //소문자
                returnVal[2]++;
            }
        }

        //대문자 소문자 숫자로 이루어진 글자수
        returnVal[3] = returnVal[0]+returnVal[1]+returnVal[2];
        
        //대문자 소문자 숫자 하나라도 없으면 -1을 담음
        for(int i=0;i<3;i++){
            if(returnVal[i] == 0){
                returnVal[4] = -1;
            }
        }
        
        System.out.println("numCount : " + returnVal[0]);
        System.out.println("bigACount : " + returnVal[1]);
        System.out.println("smallACount : " + returnVal[2]);
        System.out.println("total : " + returnVal[3]);
        System.out.println("nullCheck : " + returnVal[4]);

        return returnVal;
    }
    boolean checkPw(String str){
        boolean returnVal = false;
        String[] tempCheck = {"!","_","&"};
        for(int i=0;i<tempCheck.length;i++){
            if(str.contains(tempCheck[i])){
                returnVal = true;
            }
            if(str.indexOf(tempCheck[i]) > -1){
                returnVal = true;
            }
        }
        return returnVal;
    }
    void J031_1(){
        String userId;
        String password;
        String name;

        Scanner in = new Scanner(System.in);	// Scanner 객체 생성

        while(true) {
            System.out.print("id: ");
            userId = in.next();
            int[] tempIdCheck = checkId(userId);

            int each = userId.charAt(0);
            if(
                    (each >= 65 && each <= 90)
                && (each >= 97 && each <= 122)
            ){
                if(tempIdCheck[3] == userId.length() && tempIdCheck[4] == 0){
                    break;
                } else {
                    System.out.println("input again!!");
                }
            } else {
                System.out.println("첫글자는 무조건 영문 ㄱㄱ!!");
            }
        }

        while(true){
            System.out.print("password: ");
            password = in.next();
            int[] tempIdCheck = checkId(password);
            if(password.length() <= 3){
                System.out.println("password is too short");
            } else {
                if(tempIdCheck[4] != -1 && checkPw(password)){
                    break;
                } else {
                    System.out.println("input again!!");
                }
            }
        }

        String pwPrint = "";
        String pwPrint2 = "";
        for(int i=0;i<password.length()-3;i++){
            pwPrint += password.substring(i,i+1);
        }
        //pwPrint = password.substring(0 ,password.length()-3);
        pwPrint += "***";

        for(int i=0;i<password.length();i++){
            if(i<password.length() -3){
                pwPrint2 += password.substring(i,i+1);
            } else {
                pwPrint2 += "*";
            }
        }

        System.out.print("name: ");
        name = in.next();

        System.out.println("userId : " + userId);
        System.out.println("password : " + password);
        System.out.println("pwPrint : " + pwPrint);
        System.out.println("pwPrint2 : " + pwPrint2);
        System.out.println("name : " + name);
    }

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

        /*
        isLetter(char ch)

        isDigit(char ch)
         */
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
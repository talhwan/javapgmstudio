package week7;

import java.util.Scanner;

public class Lecture20240419_2 {
    public static void main(String[] args) {
        Lecture20240419_2 pStudio = new Lecture20240419_2();
        pStudio.practice002();
    }

    void practice000(){
        String str = "0123456789";
        System.out.println("!!" + str.substring(2,6));

        String today = "2024-04-19";
        String year = today.substring(0,4);
        String month = today.substring(5,7);
        String day = today.substring(8,10);

        //20240419
        String todayNum = today.replaceAll("-", "");
        //int => Integer
        //double => Double
        int todayNumber = Integer.parseInt(todayNum);
        double aaa = 2.0;
        int doubleAaa = (int) aaa;

        String[] arrayToday = today.split("-");
        for(int i=0;i<arrayToday.length;i++){
            System.out.println(i + " : " + arrayToday[i]);
        }

        int a = 0;
        //a == 0
        String str1 = "1";
        if(str1.equals("1")){
        }
        if("1".equals(str1)){
        }
        String str2 = "12345";
        if(str2.contains("3")){

        }
        int str2_a = str2.indexOf("a"); //-1
        int str2_3 = str2.indexOf("3"); //2

    }
    boolean checkId(String str){
        if(countThis(2, str) < 1){
            System.out.println("ID should include lower case letter!");
            return false;
        }
        if(countThis(0, str) < 1){
            System.out.println("ID should include number!");
            return false;
        }
        if(countThis(0, str) + countThis(2, str) != str.length()){
            System.out.println("Id contains an illegal character");
            return false;
        }
        return true;
    }
    boolean checkPw(String str){
        if(countThis(2, str) < 1){
            System.out.println("ID should include lower case letter!");
            return false;
        }
        if(countThis(1, str) < 1){
            System.out.println("ID should include upper case letter!");
            return false;
        }
        if(countThis(0, str) < 1){
            System.out.println("ID should include number!");
            return false;
        }
        if(countThis(3, str) < 1){
            System.out.println("ID should include '!' or '_' or '&'!");
            return false;
        }
        if(countThis(0, str)
                + countThis(1, str)
                + countThis(2, str)
                + countThis(3, str)
                != str.length()){
            System.out.println("Id contains an illegal character");
            return false;
        }
        return true;
    }
    int countThis(int type, String str){
        //type 숫자0 대문자1 소문자2 기호3
        int[] returnVal = {0,0,0,0};
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
            String eachString = str.substring(i, i+1);
            if(
                    eachString.contains("!")
                            || eachString.contains("_")
                            || eachString.contains("&")
            ){
                //기호
                returnVal[3]++;
            }
        }
        return returnVal[type];
    }
    void practice001(){
        String userId;
        String password;
        String name;

        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("id: ");
            userId = in.next();
            if(checkId(userId)){
                break;
            } else {
                System.out.println("input again");
            }
        }
        while(true){
            System.out.print("password: ");
            password = in.next();
            if(checkPw(password)){
                break;
            } else {
                System.out.println("input again");
            }
        }
        System.out.print("name: ");
        name = in.next();

        String printPw = "";
        printPw = password.substring(0,password.length() - 3) + "***";
        System.out.println("id : " + userId);
        System.out.println("password : " + password);
        System.out.println("password : " + printPw);
        System.out.println("name : " + name);
    }
    void practice002(){
        String str;
        String reverse = "";

        String reverse2 = "";
        StringBuilder reverseBuilder = new StringBuilder();

        Scanner in = new Scanner(System.in);	// Scanner 객체 생성

        System.out.print("str: ");
        str = in.next();

        for(int i=0;i<str.length();i++){
            int reverse_i = str.length() - 1 - i;
            reverse += str.substring(reverse_i,reverse_i+1);
            reverseBuilder.append(str.charAt(reverse_i));
        }
        reverse2 = reverseBuilder + "";
        System.out.println("str : " + str);
        System.out.println("reverse : " + reverse);
        System.out.println("reverse2 : " + reverse2);
        System.out.println("reverseBuilder : " + reverseBuilder.toString());
    }
}
package week9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto365 {
    private int[] numbers;

    //
    public Lotto365(){
        remakeAuto();
    }
    public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }
    public int[] getNumbers(){
        return numbers;
    }
    public int getRandomValue(){
        Random random = new Random();
        return random.nextInt(45) + 1;
    }
    public boolean checkExistNumber(int[] array, int number){
        boolean resultValue = false;
        for(int each : array) {
            if(number == each){
                resultValue = true;
            }
        }
        return resultValue;
    }
    public void checkWinnerWithClass(Lotto365 w, Lotto365 t){
        System.out.println(checkWinner(w.getNumbers(), t.getNumbers()));
    }
    public String checkWinner(int[] w, int[] t){
        String resultString = "";
        int count = checkMatchNumber(w, t);
        if(count > 5){
            resultString = "1등";
        } else if(count > 4){
            resultString = "2등";
        } else {
            resultString = "꽝";
        }
        return resultString + " (총 " + count + "개) 일치";
    }
    public int checkMatchNumber(int[] w, int[] t){
        int count = 0;
        int count1 = 0;
        for(int each : t){
            if(checkExistNumber(w, each)){
                count++;
            }
        }
        for(int i=0;i<w.length;i++){
            for(int j=0;j<t.length;j++) {
                if(w[i] == t[j]){
                    count1++;
                }
            }
        }
        System.out.println(count + "===" + count1);
        return count;
    }
    public int inputNumber(int order){
        Scanner in = new Scanner(System.in);
        int returnValue = 0 ;
        while(true){
            System.out.print((order + 1) + " num : ");
            returnValue = in.nextInt();
            if(returnValue >= 1 && returnValue <= 45){
                break;
            } else {
                //System.out.println("wrong number!!");
            }
        }
        return returnValue;
    }
    //
    public void remake(){
        remakeBoth("manual");
    }
    //
    public void remakeAuto(){
        remakeBoth("auto");
    }
    public void remakeBoth(String type){
        setNumbers(new int[6]);
        int[] newArray = new int[6];
        for(int i=0;i<newArray.length;i++) {
            while(true){
                int num = 0;
                if("auto".equals(type)){
                    num = getRandomValue();
                } else {
                    num = inputNumber(i);
                }
                if(!checkExistNumber(newArray, num)){
                    newArray[i] = num;
                    break;
                }
            }
        }
        Arrays.sort(newArray);
        setNumbers(newArray);
    }
    //
    public void printNumbers(){
        System.out.print("LOTTO NUMBERS : ");
        for(int each : numbers) {
            System.out.print(each + " ");
        }
        System.out.println("");
    }

}
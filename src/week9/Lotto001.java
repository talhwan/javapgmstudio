package week9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto001 {

    private int[] numbers;

    //1) 생성자
    public Lotto001(){
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
    //3) 숫자 넣어주는 메서드
    /*
    public void remakeAuto(){
        setNumbers(new int[6]);
        int[] newArray = new int[6];
        for(int i=0;i<newArray.length;i++) {
            while(true){
                int num = getRandomValue();
                if(!checkExistNumber(newArray, num)){
                    newArray[i] = num;
                    break;
                }
            }
        }
        Arrays.sort(newArray);
        setNumbers(newArray);
    }
    */
    //3) 숫자 넣어주는 메서드
    public void remakeAuto(){
        remakeBoth("auto");
    }
    // J042 1
    public void remake(){
        remakeBoth("manual");
    }
    public int inputNumber(int order){
        Scanner in = new Scanner(System.in);
        int returnValue = 0 ;
        while(true){
            System.out.print((order + 1) + " num : ");
            returnValue = in.nextInt();
            if(returnValue >= 1 && returnValue <= 45){
                break;
            }
        }
        return returnValue;
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
    //2) 정보 출력하는 메서드
    public void printNumbers(){
        System.out.print("LOTTO NUMBERS : ");
        for(int each : numbers) {
            System.out.print(each + " ");
        }
        System.out.println("");
    }

    public int checkLotto(int[] check){
        int[] t = getNumbers();
        int count = 0;
        int count1 = 0;
        for(int each : t){
            if(checkExistNumber(check, each)){
                count++;
            }
        }
        for(int i=0;i<check.length;i++){
            for(int j=0;j<t.length;j++) {
                if(check[i] == t[j]){
                    count1++;
                }
            }
        }
        System.out.println(count + "===" + count1);
        return count;
    }

}
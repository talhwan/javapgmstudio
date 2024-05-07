package week10;
import java.util.Random;

public class MakePW {
    public MakePW(){
    }
    public String makeString(int length){
        String returnVal = "";
        for(int i=0;i<length;i++){
            returnVal += getWord();
        }
        return returnVal + "";
    }
    public void make(int length){
        System.out.println("PW : " + makeString(length));
    }
    public void make(int length, int amount){
        String[] retrunVal = new String[amount];
        for(String each : retrunVal){
            each = makeString(length);
            System.out.println("each PW : " + each);
        }
    }
    public String getWord(){
        String returnVal = "";
        Random random = new Random();
        int check = random.nextInt(4);
        int word = 0;
        switch(check){
            case 0 : // 숫자
                word = random.nextInt(10) + 48;
                break;
            case 1 : //영 대문자
                word = random.nextInt(26) + 65;
                break;
            case 2 : //영 소문자
                word = random.nextInt(26) + 97;
                break;
            case 3 : //기호
            default:
                break;
        }
        if(word > 0){
            char tempWord = (char) word;
            returnVal = tempWord + "";
        } else {
            //기호
            word = random.nextInt(3);
            String[] arrayEtc = {"!", "_", "&"};
            returnVal = arrayEtc[word];
        }
        return returnVal;
    }
}
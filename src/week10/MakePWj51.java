package week10;
import java.util.Random;

public class MakePWj51 extends MakePWj44{
    //44 클래스에는 없는데 그냥 추가로 구현
    public String makeString(int length){
        String returnVal = "";
        for(int i=0;i<length;i++){
            returnVal += getWord();
        }
        return returnVal;
    }
    //44번에 같은 이름은 있는데, 파라미터가 다릅니다!
    public void make(int length, int amount){
        for(int i=0;i<amount;i++){
            String each = makeString(length);
            System.out.println("j51 / each PW : " + each);
        }
    }
}
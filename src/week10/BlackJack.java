package week10;
import java.util.*;

public class BlackJack {
    String[] sCard;
    public BlackJack(){
        sCard = new String[52];
        int cardNum = 0;
        String[] cType = {"S", "D", "H", "C"};
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                String jString = (j + 1) + "";
                if(j == 0){ jString = "A";}
                else if(j == 10){ jString = "J";}
                else if(j == 11){ jString = "Q";}
                else if(j == 12){ jString = "K";}
                sCard[cardNum++] = cType[i] +"_"+ jString;
            }
        }
    }

    public void printCard(){
        for(String each : sCard){
            System.out.println(each);
        }
    }
    public void suffle(){
        String[] newCard = new String[sCard.length];
        List<String> a_list =Arrays.asList(sCard);
        Collections.shuffle(a_list);
        a_list.toArray(newCard);
        sCard = newCard;
    }

}
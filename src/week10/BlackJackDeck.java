package week10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BlackJackDeck {
    //
    String[] arrayCard;

    public void setArrayCard(String[] arrayCard){
        this.arrayCard = arrayCard;
    }
    public String[] getArrayCard(){
        return arrayCard;
    }

    public BlackJackDeck(int num){
        arrayCard = new String[num * 52];
        String[] nCard = initCards();
        int cardNum = 0;
        for(int i = 0; i < num; i++){
            for(int j=0; j < 52; j++){
                arrayCard[cardNum++] = nCard[j];
            }
        }

    }
    public String[] initCards(){
        String[] nCard = new String[52];
        int cardNum = 0;
        String[] cType = {"S", "D", "H", "C"};
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                String jString = (j + 1) + "";
                if(j == 0){ jString = "A";}
                else if(j == 10){ jString = "J";}
                else if(j == 11){ jString = "Q";}
                else if(j == 12){ jString = "K";}
                nCard[cardNum++] = cType[i] +"_"+ jString;
            }
        }
        return nCard;
    }

    public String toString(){
        String returnValue = "";
        for(String each : arrayCard){
            returnValue += (each + " ");
        }
        return returnValue;
    }
    public void suffle(){
        String[] nCard = new String[arrayCard.length];
        List<String> a_list =Arrays.asList(arrayCard);
        Collections.shuffle(a_list);
        a_list.toArray(nCard);
        arrayCard = nCard;
    }

}
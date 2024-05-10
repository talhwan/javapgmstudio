package week10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NewBlackJackDeck {
    BlackJackCard[] arrayCard;

    public void setArrayCard(BlackJackCard[] arrayCard) {
        this.arrayCard = arrayCard;
    }
    public BlackJackCard[] getArrayCard() {
        return arrayCard;
    }

    public NewBlackJackDeck(int num){
        arrayCard = new BlackJackCard[num * 52];
        BlackJackCard[] nCard = initCards();
        int cardNum = 0;
        for(int i = 0; i < num; i++){
            for(int j=0; j < 52; j++){
                arrayCard[cardNum++] = nCard[j];
            }
        }

    }
    public BlackJackCard[] initCards(){
        BlackJackCard[] arrayNCard = new BlackJackCard[52];
        int cardNum = 0;
        String[] cType = {"S", "D", "H", "C"};
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                String jString = (j + 1) + "";
                int point = (j + 1);
                boolean booleanAce = false;
                if(j == 0){ jString = "A"; booleanAce = true;}
                else if(j == 10){ jString = "J"; point = 10;}
                else if(j == 11){ jString = "Q"; point = 10;}
                else if(j == 12){ jString = "K"; point = 10;}
                BlackJackCard nCard = new BlackJackCard();
                nCard.setTitle(cType[i] +"_"+ jString);
                nCard.setPoint(point);
                nCard.setAce(booleanAce);
                arrayNCard[cardNum++] = nCard;
            }
        }
        return arrayNCard;
    }

    public String toString(){
        return arrayCard.toString();
    }
    public void suffle(){
        BlackJackCard[] nCard = new BlackJackCard[arrayCard.length];
        List<BlackJackCard> a_list =Arrays.asList(arrayCard);
        Collections.shuffle(a_list);
        a_list.toArray(nCard);
        arrayCard = nCard;
    }

}
package week10;

import week9.Lotto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        //pStudio.j052();
        pStudio.bj();
    }
    void j051_2(){
        MakePWj44 makePWj44 = new MakePWj44();
        makePWj44.make(12);
        MakePWj51 makePWj51 = new MakePWj51();
        makePWj51.make(12);
        makePWj51.make(12, 8);
    }
    void j051(){
        MakePW makePW = new MakePW();
        makePW.make(10);
        makePW.make(10, 5);

        MakePassword makePassword = new MakePassword();
        makePassword.make(10);
        makePassword.make(10, 5);

        MakePWj51 makePWj51 = new MakePWj51();
        makePWj51.make(10);
        System.out.println(makePWj51.makeString(10));
        makePWj51.make(10, 5);
    }
    void j052(){
        Score score = new Score(2);
        score.getScore();
        score.printScore();
    }
    void bj(){
        BlackJackDeck bj = new BlackJackDeck(4);
        System.out.println("1st Trial");
        System.out.println(bj.toString());
        bj.suffle();
        System.out.println("2nd Trial");
        System.out.println(bj.toString());

        NewBlackJackDeck newBj = new NewBlackJackDeck(4);
        System.out.println("1st Trial");
        System.out.println(newBj.toString());
        newBj.suffle();
        System.out.println("2nd Trial");
        System.out.println(newBj.toString());
    }
}
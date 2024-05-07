package week10;

import week9.Lotto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.j052();
    }
    void j051(){
        MakePW makePW = new MakePW();
        makePW.make(10);
        makePW.make(10, 5);
    }
    void j052(){
        Score score = new Score(2);
        score.getScore();
        score.printScore();
    }
}
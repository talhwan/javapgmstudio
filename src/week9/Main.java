package week9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J043();
    }

    void J041(){
        System.out.println("0. Lotto 인스턴스 만들기");
        Lotto lotto = new Lotto();
        System.out.println("0-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
        System.out.println("1. Lotto 인스턴스 값 재설정하기(자동)");
        lotto.remakeAuto();
        System.out.println("1-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
    }
    void J042(){
        System.out.println("0. Lotto 인스턴스 만들기");
        Lotto lotto = new Lotto();
        System.out.println("0-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
        System.out.println("2. Lotto 인스턴스 값 재설정하기(수동)");
        lotto.remakeManual();
        System.out.println("2-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
    }
    void J043(){
        System.out.println("0. Lotto 인스턴스 만들기(당첨값)");
        Lotto lottoWin = new Lotto();
        System.out.println("0-1. Lotto 인스턴스 값 확인하기");
        lottoWin.printNumbers();

        Lotto lottoTry = new Lotto();
        System.out.println("3. Lotto 인스턴스 값 설정하기(수동)");
        lottoTry.remakeManual();
        System.out.println("2-1. Lotto 인스턴스 값 확인하기");
        lottoTry.printNumbers();

        int match = lottoWin.checkWin(lottoWin, lottoTry);
        System.out.println("match : " + match);
        System.out.println("winner : " + lottoWin.winner(lottoWin, lottoTry));

    }
}
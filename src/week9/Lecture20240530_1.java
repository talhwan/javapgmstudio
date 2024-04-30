package week9;

public class Lecture20240530_1 {
    public static void main(String[] args) {
        Lecture20240530_1 pStudio = new Lecture20240530_1();
        pStudio.J043();
    }
    void J041(){
        System.out.println("0. Lotto 인스턴스 만들기");
        Lotto365 lotto = new Lotto365();
        System.out.println("0-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
        System.out.println("1. Lotto 인스턴스 값 재설정하기(자동)");
        lotto.remakeAuto();
        System.out.println("1-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
    }
    void J042(){
        System.out.println("0. Lotto 인스턴스 만들기");
        Lotto365 lotto = new Lotto365();
        System.out.println("0-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
        System.out.println("2. Lotto 인스턴스 값 재설정하기(수동)");
        lotto.remake();
        System.out.println("2-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
    }
    void J043(){
        System.out.println("0. Lotto 인스턴스 만들기");
        Lotto365 lottoWinner = new Lotto365();
        System.out.println("0-1. Lotto 인스턴스 값 확인하기(당첨번호)");
        System.out.println("===원래는 입력 받고, 당첨번호를 추첨해야 하지만, 순서 바꾸기!!===");
        lottoWinner.printNumbers();
        System.out.println("3. Lotto 인스턴스 값 생성하기(수동)");
        Lotto365 lottoTry = new Lotto365();
        lottoTry.remake();
        System.out.println("3-1. Lotto 인스턴스 값 확인하기");
        lottoTry.printNumbers();

        System.out.println("3-2. Lotto 당첨 여부 확인하기");
        String result = lottoTry.checkWinner(lottoWinner.getNumbers(), lottoTry.getNumbers());
        System.out.println("result : " + result);
        lottoTry.checkWinnerWithClass(lottoWinner, lottoTry);
    }
}
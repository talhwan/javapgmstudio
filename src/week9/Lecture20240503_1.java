package week9;

public class Lecture20240503_1 {
    public static void main(String[] args) {
        Lecture20240503_1 pStudio = new Lecture20240503_1();
        pStudio.j042();
    }
    void j041(){
        System.out.println("0. Lotto 인스턴스 만들기");
        Lotto001 lotto = new Lotto001();
        System.out.println("0-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
        System.out.println("1. Lotto 인스턴스 값 재설정하기(자동)");
        lotto.remakeAuto();
        System.out.println("1-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
    }

    void j042(){
        System.out.println("0. Lotto 인스턴스 만들기");
        Lotto001 lotto = new Lotto001();
        System.out.println("0-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
        System.out.println("2. Lotto 인스턴스 값 재설정하기(수동)");
        lotto.remake();
        System.out.println("2-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
    }
}
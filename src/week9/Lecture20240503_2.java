package week9;

public class Lecture20240503_2 {
    public static void main(String[] args) {
        Lecture20240503_2 pStudio = new Lecture20240503_2();
        pStudio.j043();
    }
    void j041(){
        System.out.println("0. Lotto 인스턴스 만들기");
        Lotto003 lotto = new Lotto003();
        System.out.println("0-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
        System.out.println("1. Lotto 인스턴스 값 재설정하기(자동)");
        lotto.remakeAuto();
        System.out.println("1-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
    }
    void j042(){
        System.out.println("0. Lotto 인스턴스 만들기");
        Lotto003 lotto = new Lotto003();
        System.out.println("0-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
        System.out.println("2. Lotto 인스턴스 값 재설정하기(수동)");
        lotto.remake();
        System.out.println("2-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();
    }
    void j043(){
        System.out.println("0. Lotto 인스턴스 만들기");
        Lotto003 lotto = new Lotto003();

        System.out.println("2. Lotto 인스턴스 값 설정하기(수동)");
        lotto.remake();
        System.out.println("3-1. Lotto 인스턴스 값 확인하기");
        lotto.printNumbers();

        Lotto003 w = new Lotto003();
        System.out.println("3-2. Lotto 인스턴스 값 설정하기(당첨값)");
        w.printNumbers();
        int count = lotto.checkLotto(w.getNumbers());
        System.out.println("3-3. Lotto 인스턴스 값 일치 개수 : " + count);
    }
}
package week14;

public class Score {
    String name;
    int kor, eng, mat;
    int sum;
    double avg;

    public Score(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.sum = kor + eng + mat;
        this.avg = sum / 3;
    }

    public String getName() {
        return name;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMat() {
        return mat;
    }
    public int getSum() {
        return sum;
    }
    public double getAvg() {
        return avg;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return name + " " + kor + " " + eng + " " + mat;
    }

}
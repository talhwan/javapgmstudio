package week10;
import java.util.Scanner;

public class Score {
    int count;
    int[][] jumsu;
    int sum_student;
    double[] average_student;
    //추가한 필드
    String[] arrayClass = {"국","영","수", "총점"};

    public Score(int count){
        this.count = count;
        jumsu = new int[count][4];
        sum_student = 0;
        average_student = new double[count];
    }
    public void getScore(){
        for(int i=0;i<count;i++){
            System.out.println((i+1)+"번째 학생 점수 입력 시작");
            inputJumsu(jumsu[i]);
            System.out.println((i+1)+"번째 학생 점수 입력 종료");
            average_student[i] = (double) jumsu[i][3] / 3;
        }
    }
    public void printScore(){
        for(int i=0;i<jumsu.length;i++){
            System.out.println((i+1)+"학생 점수");
            for(int j=0;j<jumsu[i].length;j++) {
                System.out.println(arrayClass[j] + ":" + jumsu[i][j]);
            }
            String grade = "";
            if(average_student[i] >= 90){
                grade = "A";
            } else if(average_student[i] >= 80){
                grade = "B";
            } else if(average_student[i] >= 70){
                grade = "C";
            } else if(average_student[i] >= 60){
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("평균 :" + average_student[i]);
            System.out.println("등급 :" + grade);
        }
    }
    //추가로 만든것
    public void inputJumsu(int[] tempJumsu){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<3;i++){
            System.out.print(arrayClass[i] +" : ");
            tempJumsu[i] = in.nextInt();
            sum += tempJumsu[i];
        }
        tempJumsu[3] = sum;
    }
}
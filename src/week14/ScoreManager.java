package week14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreManager {
    List<Score> scores;

    public ScoreManager() {
        this.scores = new ArrayList<>();
        try{
            File file = new File("./src/week14/scores.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                addScore(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public List<Score> getScores() {
        return scores;
    }
    public void setScores(ArrayList<Score> scores) {
        this.scores = scores;
    }
    public void addScore(Score score) {
        scores.add(score);
    }
    public void addScore(String data) {
        String[] arrayData = data.split(" ");
        scores.add(new Score(arrayData[0], Integer.parseInt(arrayData[1]), Integer.parseInt(arrayData[2]), Integer.parseInt(arrayData[3])));
    }
    public void removeScore(int index) {
        scores.remove(index);
    }
    public void saveScores() {
        String datas = "";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./src/week14/scores.txt");
            for (Score score : scores) {
                datas += score.toString() + "\n";
            }

            byte b[] = datas.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public int getScoreKorTotal(){
        int total = 0;
        for (Score score : scores) {
            total += score.getKor();
        }
        return total;
    }
    public int getScoreEngTotal(){
        int total = 0;
        for (Score score : scores) {
            total += score.getEng();
        }
        return total;
    }
    public int getScoreMatTotal(){
        int total = 0;
        for (Score score : scores) {
            total += score.getMat();
        }
        return total;
    }
}
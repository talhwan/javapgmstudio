package week14;


import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreManager2 {
    Map<String, Score> scores;
    // 키 값은 이름, value 로는 스코어 객체 전체!!

    public ScoreManager2() {
        this.scores = new HashMap<>();
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

    public Map<String, Score> getScores() {
        return scores;
    }
    public void setScores(Map<String, Score> scores) {
        this.scores = scores;
    }

    public void addScore(Score score) {
        scores.put(score.getName(), score);
    }
    public void addScore(String data) {
        String[] arrayData = data.split(" ");
        scores.put(arrayData[0], new Score(arrayData[0], Integer.parseInt(arrayData[1]), Integer.parseInt(arrayData[2]), Integer.parseInt(arrayData[3])));
    }
    public void removeScore(String key) {
        scores.remove(key);
    }
    public void saveScores() {
        String datas = "";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./src/week14/scores.txt");
            for (String key : scores.keySet()) {
                //Score score = scores.get(key);
                datas += scores.get(key).toString() + "\n";
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
        /*
        for (String key : scores.keySet()) {
            total += scores.get(key).getKor();
        }
        */
        for (Score each : scores.values()) {
            total += each.getKor();
        }
        return total;
    }
    public int getScoreEngTotal(){
        int total = 0;
        for (String key : scores.keySet()) {
            total += scores.get(key).getEng();
        }
        return total;
    }
    public int getScoreMatTotal(){
        int total = 0;
        for (String key : scores.keySet()) {
            total += scores.get(key).getMat();
        }
        return total;
    }
}
package week14;


import java.util.HashMap;
import java.util.Map;

public class Lecture {
    public static void main(String[] args) {
        Lecture pStudio = new Lecture();
        pStudio.mapTest();
    }

    public void mapTest() {

        /*
        Map<String, Object> a_map = new HashMap<>();
        a_map.put("11", 1234);
        a_map.put("12", 6734);
        System.out.println(a_map.get("11"));
        System.out.println(a_map.get("08098098"));
        System.out.println(a_map);
        a_map.remove("11");
        a_map.remove("222222");
        System.out.println(a_map);

        HashMap과 동일한 기능을 만들어보기

        MapHashStringObject
        key는 String
        value는 Object 형태로

        put(String key, Object value)
        get(String key)
        remove(String key)

        * */

        MapHashStringObject a = new MapHashStringObject();
        a.put("11", 112233);
        a.put("12", 11223443);
        a.put("13", 11772233);
        System.out.println(a.size());
        System.out.println(a.get("11"));
        System.out.println(a.get("12"));
        System.out.println(a.get("13"));
        a.remove("13");
        System.out.println(a.size());
        System.out.println(a.get("13"));
    }
    public void j083() {
        ScoreManager manager = new ScoreManager();
        Score score1 = new Score("james5", 100, 90, 80);
        Score score2 = new Score("james6", 80, 70, 60);
        System.out.println(manager.getScores().size());
        manager.addScore(score1);
        manager.addScore(score2);

        System.out.println(manager.getScores().size());
        manager.saveScores();
    }

}
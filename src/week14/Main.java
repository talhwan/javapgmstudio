package week14;


public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.j091();
    }

    public void mapTest() {
        /*
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
        System.out.println(a.keySet());

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
    public void j091() {
        ScoreManager2 manager2 = new ScoreManager2();
        Score score1 = new Score("james00", 100, 90, 80);
        Score score2 = new Score("james7", 80, 70, 60);
        System.out.println(manager2.getScores().size());
        manager2.addScore(score1);
        manager2.addScore(score2);

        System.out.println(manager2.getScores().size());
        manager2.saveScores();
    }

}
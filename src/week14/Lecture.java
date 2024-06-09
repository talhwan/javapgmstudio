package week14;


import java.util.HashMap;

public class Lecture {
    public static void main(String[] args) {
        Lecture pStudio = new Lecture();
        pStudio.mapTest();
    }

    public void mapTest() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("11", 1233450);
        map.put("11", 1233451);
        map.put("11", 1233452);
        map.put("11", 1233453);
        map.put("12", 1233777);
        map.put("13", 24253);
        map.put("14", 3);

        System.out.println(map.get("11") + "");
        System.out.println(map.get("13") + "");

        map.remove("14");

        Object obj = map.get("14reragr");
        System.out.println(obj);

        map.remove("1learagjelkg3");

    }
}
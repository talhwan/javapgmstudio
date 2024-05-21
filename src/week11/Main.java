package week11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.list4Test();
        //pStudio.mapTest();
        //pStudio.listTest();
        //pStudio.setTest();
    }

    void list4Test(){
        ListArrayObject4 a = new ListArrayObject4();
        a.add("11111");
        a.add("21111");
        a.add("31111");
        a.add("41111");
        System.out.println(a.toString());
        a.remove(2);
        System.out.println(a.toString());

        List<String> aa = new ArrayList<>();
        aa.add("11111");
        aa.add("21111");
        aa.add("31111");
        System.out.println(aa.toString());
        aa.remove(2);
        System.out.println(aa.toString());
    }
    void list3Test(){
        ListArrayObject3 alist = new ListArrayObject3();
        alist.add("111");
        alist.add("112");
        alist.add("113");
        System.out.println(alist.toString());
        alist.remove(1);
        System.out.println(alist.toString());
        System.out.println(alist.get(1));

        List<String> a = new ArrayList<>();
        a.add("111");
        a.add("112");
        a.add("113");
        System.out.println(a.toString());
        a.remove(1);
        System.out.println(a.toString());
        System.out.println(a.get(1));
    }
    void list1Test(){

        List<String> aList = new ArrayList<>();
        aList.add("a");
        aList.add("b");
        aList.add("c");
        aList.remove(1);
        String aa = aList.get(0);
        System.out.println(aa);

        ListArrayObject1 a = new ListArrayObject1();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        System.out.println(a.toString());
        System.out.println(a.size());
        System.out.println(a.get(2));
        a.remove(1);
        System.out.println(a.get(1));
    }
    void list2Test(){
        ListArrayObject2 a = new ListArrayObject2();
        a.add("11111");
        a.add("11112");
        a.add("11113");
        a.add("11114");
        a.add("11115");
        System.out.println(a.toString());
        System.out.println(a.size());
        System.out.println(a.get(1));
        a.remove(1);
        System.out.println(a.get(1));
    }
    void mapTest(){
        MapHashObject amap = new MapHashObject();
        amap.put("11", "gkgkgk1");
        amap.put("12", "gkgkgk2");
        amap.put("13", "gkgkgk3");
        amap.put("14", "gkgkgk4");
        amap.printMap();
        amap.put("15", "gkgkgk5");
        amap.printMap();
        amap.remove("13");
        amap.printMap();
        Object a = amap.get("13");
        Object b = amap.get("15");
        Object c = amap.get(15);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    void listTest(){
        ListArray<String> alist = new ListArray<>();
        alist.add("11");
        alist.add("12");
        alist.add("13");
        alist.printListArray();
        alist.remove();
        alist.add("14");
        alist.printListArray();
        alist.remove(1);
        alist.printListArray();
    }
    void setTest(){
        SetHashObject aset = new SetHashObject();
        aset.add("11");
        aset.add("12");
        aset.add("13");
        aset.printSet();
        aset.remove("12");
        aset.add("14");
        aset.printSet();
        aset.remove(1);
        aset.printSet();

        while(aset.hasNext()){
            System.out.println(aset.next());
        }
    }
}
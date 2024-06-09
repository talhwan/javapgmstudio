package week14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapHashStringObject {
    //필드
    Object[][] a_array;
    /*
    String[] key;
    Object[] value;
    */
    //생성자!
    public MapHashStringObject() {
        a_array = new Object[0][2];
    }

    //배열에 있는 번호인지 확인하는 메서드
    public boolean ableToAccess(int i){
        boolean returnValue = false;
        if(i < a_array.length && i >= 0){
            returnValue = true;
        }
        return returnValue;
    }

    //해당 키가 있는지 확인
    public boolean contains(String key){
        boolean found = false;
        if(getOrder(key) > -1){
            found = true;
        }
        return found;
    }
    public int getOrder(String key){
        int order = -1;
        for(int i=0;i<a_array.length;i++){
            if(key.equals(a_array[i][0])){
                order = i;
            }
        }
        return order;
    }

    public Object get(String key){

        int order = getOrder(key);

        if(order > -1){
            return a_array[order][1];
        } else {
            return null;
        }
    }
    //추가하기
    public void put(String key, Object value) {
        int order = getOrder(key);

        if(order > -1){
            a_array[order][1] = value;
        } else {
            Object[][] new_array = new Object[a_array.length + 1][2];
            for(int i=0;i<a_array.length;i++){
                new_array[i] = a_array[i];
            }
            new_array[a_array.length][0] = key;
            new_array[a_array.length][1] = value;
            a_array = new_array;
        }
    }

    //정보 하나 지우기
    public void remove(String key) {
        int order = getOrder(key);
        if(order > -1){
            Object[][] new_array = new Object[a_array.length - 1][2];
            for(int i=0;i<order;i++){
                new_array[i] = a_array[i];
            }
            for(int i=order+1;i<a_array.length;i++){
                new_array[i-1] = a_array[i];
            }
            a_array = new_array;
        }
    }
    public void clear() {
        a_array = new Object[0][2];
    }

    public void printThis() {
        for (Object o[] : a_array) {
            System.out.println(o[0] + ":"+o[1]);
        }
    }

    public int size(){
        return a_array.length;
    }

    public Set<String> keySet(){
        Set<String> keySet = new HashSet<String>();
        for (Object o[] : a_array) {
            keySet.add(o[0] + "");
        }
        return keySet;
    }
    public List<Object> values(){
        List<Object> values = new ArrayList<Object>();
        for (Object o[] : a_array) {
            values.add(o[1]);
        }
        return values;
    }
}

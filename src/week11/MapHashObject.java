package week11;

public class MapHashObject {
    //필드
    Object[][] a_array;

    //생성자!
    public MapHashObject() {
        a_array = new Object[0][2];
    }

    public int getOrder(Object o){
        int order = -1;
        for(int i=0;i<a_array.length;i++){
            if(o.equals(a_array[i][0])){
                order = i;
            }
        }
        return order;
    }

    public Object get(Object key) {
        int order = getOrder(key);
        if(order > -1){
            return a_array[getOrder(key)][1];
        } else {
            return null;
        }
    }

    //추가하기
    public void put(Object key, Object value) {
        int order = getOrder(key);
        if(order > -1){
            a_array[order][0] = key;
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
    public void remove(Object key) {
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

    public void printMap() {
        for (Object[] o : a_array) {
            System.out.println(o[0] + " : " + o[1]);
        }
    }
}

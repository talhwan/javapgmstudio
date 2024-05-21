package week11;

public class SetHashObject {
    //필드
    Object[] a_array;
    int tempOrder;

    //생성자!
    public SetHashObject() {
        a_array = new Object[0];
        tempOrder = 0;
    }

    //배열에 있는 번호인지 확인하는 메서드
    public boolean ableToAccess(int i){
        boolean returnValue = false;
        if(i < a_array.length && i >= 0){
            returnValue = true;
        }
        return returnValue;
    }

    public boolean hasNext(){
        return ableToAccess(tempOrder);
    }
    public Object next(){
        Object returnValue = null;
        if(ableToAccess(tempOrder)){
            returnValue = a_array[tempOrder];
            tempOrder++;
        } else {
            // 초기화 하는 부분
            tempOrder = 0;
        }
        return returnValue;
    }

    //해당 객체가 있는지 확인
    public boolean contains(Object o){
        boolean found = false;
        if(getOrder(o) > -1){
            found = true;
        }
        return found;
    }
    public int getOrder(Object o){
        int order = -1;
        for(int i=0;i<a_array.length;i++){
            if(o.equals(a_array[i])){
                order = i;
            }
        }
        return order;
    }

    //추가하기
    public void add(Object o) {
        if(contains(o)){
        } else {
            Object[] new_array = new Object[a_array.length + 1];
            for(int i=0;i<a_array.length;i++){
                new_array[i] = a_array[i];
            }
            new_array[a_array.length] = o;
            a_array = new_array;
        }
    }

    //정보 하나 지우기
    public void remove(Object o) {
        int order = getOrder(o);
        if(order > -1){
            Object[] new_array = new Object[a_array.length - 1];
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
        a_array = new Object[0];
        tempOrder = 0;
    }

    public void printSet() {
        for (Object o : a_array) {
            System.out.println(o);
        }
    }

    public int size(){
        return a_array.length;
    }
}

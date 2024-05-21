package week11;

public class ListArrayObject3 {
    Object[] aArray = null;
    public ListArrayObject3() {
        aArray = new Object[0];
    }

    public void add(Object o){
        /*데이터 추가하는 메서드
        정보를 전달하면 해당 정보를 가장 뒤에 추가한다.*/
        /*
        a - > {1 2 3 4 5}
        n - > {n n n n n 6}
        a -> n
        * */
        Object[] nArray = new Object[size() + 1];
        for(int i=0;i<aArray.length;i++){
            nArray[i] = aArray[i];
        }
        nArray[size()] = o;
        aArray = nArray;
    }

    public boolean isIndex(int index){
        return index >= 0 && index < aArray.length;
    }
    public Object get(int index){
        if(isIndex(index)){
            return aArray[index];
        } else {
            return null;
        }
    }
    public void remove(int index){
        if(isIndex(index)){
            Object[] nArray = new Object[size() - 1];
            for(int i=0;i<aArray.length;i++){
                if(i<index){
                    nArray[i] = aArray[i];
                } else if(i == index){
                    //
                } else {
                    nArray[i-1] = aArray[i];
                }
            }
            aArray = nArray;
        }
    }

    public void remove(){
        remove(size() - 1);
    }

    public int size(){
        return aArray.length;
    }

    public String toString(){
        String returnValue = "";
        for(int i=0;i<aArray.length;i++){
            returnValue += aArray[i].toString() + " ";
        }
        return returnValue;
    }


}

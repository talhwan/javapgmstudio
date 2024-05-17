package week11;

public class ListArrayObject1 {
    Object[] aArray = null;
    public ListArrayObject1() {
        aArray = new Object[0];
    }

    public void add(Object o){
        /*데이터 추가하는 메서드
        정보를 전달하면 해당 정보를 가장 뒤에 추가한다.*/
        /*
        a {1,2,3,4,5}
        n {n,n,n,n,n,o}
        a -> n {o}
        * */
        Object[] newArray = new Object[size() + 1];
        for(int i = 0; i < aArray.length; i++){
            newArray[i] = aArray[i];
        }
        newArray[size()] = o;
        aArray = newArray;
    }

    public boolean isNull(int index){
        if(index > -1 && index < aArray.length){
            return false;
        } else {
            return true;
        }
    }

    public Object get(int index){
        /*순번을 전달하면 해당하는 순번에 있는 데이터를 조회한다.
        해당 순번에 데이터가 없는 경우에는 null을 리턴한다.*/
        if(isNull(index)){
            return null;
        } else {
            return aArray[index];
        }
    }

    public void remove(int index){
        /*순번을 전달하면 해당하는 순번에 있는 데이터를 삭제한다.
        (중간에 있는 순번의 데이터가 삭제되는 경우, 후순위 데이터의 순번은 1씩 감소한다.)
        해당 순번에 데티어가 없는 경우에는 삭제가 이루어지지 않는다.
        */
        Object[] newArray = new Object[size() - 1];
        for(int i=0;i<aArray.length;i++){
            if(i < index){
                newArray[i] = aArray[i];
            } else if(i > index){
                newArray[i - 1] = aArray[i];
            }
        }
        aArray = newArray;
    }
    public void remove(){
        /*가장 마지막에 있는 정보를 삭제한다.*/
        remove(size() -1);
    }

    public int size(){
        /*목록의 개수를 호출한다.*/
        return aArray.length;
    }

    public String toString(){
        String s = "";
        for(int i = 0; i < aArray.length; i++){
            s += aArray[i].toString() + " ";
        }
        return s;
    }
}

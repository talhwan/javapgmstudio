package week11;

public class ListArrayObject2 {
    Object[] aArray = null;

    public ListArrayObject2(){
        aArray = new Object[0];
    }

    //add
    public void add(Object o){
    /*
    데이터 추가하는 메서드
    정보를 전달하면 해당 정보를 가장 뒤에 추가한다.
    */
        Object[] newArray = new Object[aArray.length + 1];
        //0 1 2 3 4 5
        //0 1 2 3 4 5 6
        for(int i = 0; i < aArray.length; i++){
            newArray[i] = aArray[i];
        }
        newArray[aArray.length] = o;
        aArray = newArray;
    }

    public boolean isIndexOk(int index){
        if(index > 0 && index < aArray.length){
            return true;
        } else {
            return false;
        }
    }

    public Object get(int index){
        /*순번을 전달하면 해당하는 순번에 있는 데이터를 조회한다.
        해당 순번에 데이터가 없는 경우에는 null을 리턴한다.*/
        if(isIndexOk(index)){
            return aArray[index];
        } else {
            return null;
        }
    }

    public void remove(int index){
    /*순번을 전달하면 해당하는 순번에 있는 데이터를 삭제한다.
            (중간에 있는 순번의 데이터가 삭제되는 경우, 후순위 데이터의 순번은 1씩 감소한다.)
    해당 순번에 데티어가 없는 경우에는 삭제가 이루어지지 않는다.
    */
        if(isIndexOk(index)){
            // 0 1 2 3 4 5
            // 0 1 2 3 4 5 6
            // 0 1 3 4 5 6
            Object[] newArray = new Object[aArray.length - 1];
            //0 1 2 3 4 5
            //0 1 2 3 4 5 6
            for(int i = 0; i < aArray.length; i++){
                if(i < index){
                    /*
                    0 ----- 0
                    1 ----- 1
                    2 ----- 2
                    * */

                    newArray[i] = aArray[i];
                } else if(i == index){
                    //
                } else {
                    /*
                    3 ----- 4
                    4 ----- 5
                    5 ----- 6
                    * */
                    newArray[i -1] = aArray[i];
                }

            }
            aArray = newArray;
        }
    }
    public void remove(){
    //가장 마지막에 있는 정보를 삭제한다.
        remove(aArray.length - 1);
    }

    public int size(){
    //목록의 개수를 호출한다.
        return aArray.length;
    }
    public String toString(){
        //목록 전체를 정보 전달한다.
        String returnVal = "";
        for(int i = 0; i < aArray.length; i++){
            returnVal += aArray[i].toString() + " ";
        }
        return returnVal;
    }
}

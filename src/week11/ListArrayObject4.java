package week11;

public class ListArrayObject4 {
    //Object[] aArray = new Object[0];
    Object[] aArray = null;

    public ListArrayObject4() {
        aArray = new Object[0];
    }

    public void add(Object o) {
        // a -> {}
        // n -> {n}
        // n -> {o}
        /*
        a -> {1 2 3 4 5}
        n -> {1 2 3 4 5 n}
        n -> {n n n n n o}
         */
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
                if(i < index){
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

    @Override
    public String toString(){
        String s = "[";
        for(int i=0;i<aArray.length;i++){
            if(i == 0){
                s += aArray[i].toString();
            } else {
                s += ", " + aArray[i].toString();
            }
        }
        s += "]";
        return s;
    }

    public Object[] toArray(){
        return aArray;
    }

}

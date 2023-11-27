class GenericValue<T>{
    private T obj;
    public void setValue(T value){
        obj=value;
    }
    public T getValue(){
        return obj;
    }
}
public class GenericsFirst {
    public static void main(String[] args) {
        GenericValue<Integer> gv=new GenericValue();
        gv.setValue(66);
        System.out.println(gv.getValue());  
    }
}

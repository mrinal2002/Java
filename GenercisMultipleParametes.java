class MyArray<T,K>{
    T A[]=(T[]) new Object[20];
    int length=0;
    public void append(T value){
        A[length]=value;
        length++;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}
public interface GenercisMultipleParametes {
    public static void main(String[] args) {
      MyArray<String,Integer>ma=new MyArray(); // multiple parameters are allowed in generics in java   
    }
}

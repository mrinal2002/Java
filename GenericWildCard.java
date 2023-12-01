class MyArray<T>{
    T arr[]=(T[]) new Object[10];
    int length=0;
    public void append(T value){
        arr[length]=value;
        length++;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class GenericWildCard {
    static void fun(MyArray<?> obj){
        obj.display();
    }
    public static void main(String args[]){
        MyArray<String> ma1=new MyArray();
        ma1.append("hii");
        ma1.append("world");
        MyArray<Integer> ma2=new MyArray();
        ma2.append(10);
        ma2.append(20);

        fun(ma1);
        fun(ma2);
    }
}

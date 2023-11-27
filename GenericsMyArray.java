class MyArray<T>{
    T obj[]=(T[]) new Object[10];
    int length=0;
    public void append(T value){
        obj[length]=value;
        length++;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(obj[i]+" ");
        }
    }
}
public class GenericsMyArray {
    public static void main(String[] args) {
        MyArray<String> Ma=new MyArray<>();  // it is not mendetory to declare a diamond
        Ma.append("Hii");
        Ma.append("World");
        Ma.append("Bye !!");
        Ma.display();
    }
}

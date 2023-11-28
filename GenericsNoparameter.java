class MyArray<T>{
    T A[]=(T[]) new Object[10];
    int length=0;
    public void append(T value){
        A[length]=value;
        length++;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
public class GenericsNoparameter {
    public static void main(String[] args) {
        MyArray ma=new MyArray<>(); // here i am not using any parameter to declared any values to be add but still it is working fine becoust of object class 
        ma.append(34);
        ma.append("Hii string");
        ma.display();
    }
}

interface Test1{
    void method1();
    void method2();
}
class Test2 implements Test1{
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        System.out.println("Method 2");
    }
}
public class InterfaceFirst {
    public static void main(String args[]){
       // Test1 t=new Test1();  // it given me an error becouse interface's class should not be declared as a object becouse interface is by default abstract
       Test1 t=new Test2();
       t.method1();
       t.method2();
    }
}

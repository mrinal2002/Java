abstract class Super{
    public Super(){
        System.out.println("Super");
    }
    public void method1(){
        System.out.println("Super method 1");
    }
    abstract public void method2();
}
class Sub extends Super{
    public void method2(){
        System.out.println("Sub method 2");
    }
}
public class AbstractClass1 {
    public static void main(String args[]){
        //Super s2=new Super();  //this is wrong way to implement, becouse abstract class can't be perform any object
        Sub s3=new Sub();
        s3.method2();
        Super s4=new Sub();
        s4.method2();
    }
}

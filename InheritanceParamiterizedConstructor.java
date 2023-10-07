class Parent{
    public Parent(){
        System.out.println("Non-Parameter of Parent");
    }
    public Parent(int x){
        System.out.println("Parameter of Parent "+x);
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Non-parameter of Child");
    }
    public Child(int x){
        System.out.println("Parameter of Child");
    }
    public Child(int a,int b){
        super(a);
        System.out.println("two parameter of Child "+b);
    }
}
public class InheritanceParamiterizedConstructor {
    public static void main(String args[]){
        Child c1=new Child();
        Child c2=new Child(10);
        Child c3=new Child(10,30);
    }
}

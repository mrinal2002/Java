class SuperClass{
    public void display(){
        System.out.println("Super class func");
    }
}
class SubClass extends SuperClass{
    public void display(){
        System.out.println("Sub class func");
    }
}
public class InheritanceDynamicMethodDispatch {
    public static void main(String args[]){
        SuperClass s1=new SubClass();   // the methods called depending upon the object not upon the referenced
        s1.display();
    }
}

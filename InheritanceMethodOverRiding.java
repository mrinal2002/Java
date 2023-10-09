class Super{
    public void display(){
        System.out.println("Hello");
    }
}
class SubClass extends Super{
    public void display(){
        System.out.println("Hello Welcome");
    }
}
public class InheritanceMethodOverRiding {
    public static void main(String args[]){
        Super s1=new Super();
        s1.display();
        SubClass ss=new SubClass();
        ss.display();
    }
}

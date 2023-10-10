class Super{
    public void display(){
        System.out.println("Super Display..");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Sub class display");
    }
}
public class PolymorphismOverRiding {
    public static void main(String args[]){
        Super S=new Super();
        S.display();
        Sub s=new Sub();
        s.display();
        Super S2=new Sub();
        S2.display();
    }
}

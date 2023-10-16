class Outer{
    int x=10;
    class Inner{
        int y=20;
        void InnerDisplay(){
            System.out.println("value of x is "+x);
            System.out.println("value of y is "+y);
        }
    }
    void OuterDisplay(){
        Inner i=new Inner();
        i.InnerDisplay();
        System.out.println("outer of y is "+i.y);
    }
}
public class InnerClassNested {
    public static void main(String args[]){
        Outer o=new Outer();
        o.OuterDisplay();
        Outer.Inner i=new Outer().new Inner();
        i.InnerDisplay();
    }
}

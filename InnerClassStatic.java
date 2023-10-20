class Outer{
    static int x=10;
    int y=20;

    static class Inner{
        void display(){
            System.out.println("value of x is "+x);
            System.out.println("y can't be initilize becouse of non static member");
        }
    }
}
public class InnerClassStatic {
    public static void main(String args[]){
        Outer.Inner i=new Outer.Inner();
        i.display();
        Outer o=new Outer();
        System.out.println("from main, value of y is "+o.y);
    }
}

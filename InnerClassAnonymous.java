abstract class My{
    abstract void display();
}
class Outer{
    public void meth(){
        My m=new My() {
            public void display(){
                System.out.println("Hii anonymous inner class");
            }
        };
        m.display();
    }
}
public class InnerClassAnonymous {
    public static void main(String args[]){
        Outer o=new Outer();
        o.meth();
    }
}

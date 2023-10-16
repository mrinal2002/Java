class Outer{
    void display(){
        class Inner{
            void InnerDisplay(){
                System.out.println("Hello");
            }
        }
        Inner i=new Inner();
        System.out.println("Hii");
        i.InnerDisplay();
    }
}
public class InnerClassLocal {
    public static void main(String args[]){
        Outer o=new Outer();
        o.display();
    }
}

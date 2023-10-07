class Rectangle{
    int length;
    int breadth;
   public Rectangle(){
    length=breadth=1;
   }
   public Rectangle(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
   }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(){
        height=1;
    }
    Cuboid(int h){
        height=h;
    }
    Cuboid(int l,int b,int h){
        super(l, b);
        height=h;
    }
    public int volume(){
        return length*breadth*height;
    }
}
public class InheritanceParametarizedRectangle {
    public static void main(String args[]){
        Cuboid c1=new Cuboid();
        System.out.println(c1.volume());

        Cuboid c2=new Cuboid(10);
        System.out.println(c2.volume());

        Cuboid c3=new Cuboid(10,20,30);
        System.out.println(c3.volume());
    }
}

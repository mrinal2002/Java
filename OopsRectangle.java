class Rectangle{
    public int length;
    public int breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
    boolean isSquare(){
        if(length==breadth){
            return true;
        }
        else{
            return false;
        }
    }
}
public class OopsRectangle {
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        r1.length=5;
        r1.breadth=5;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
    }
}

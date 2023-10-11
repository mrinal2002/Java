abstract class Shape{
    abstract public double area();
    abstract public double perimeter();
}
class Rectangle extends Shape{
    double length;
    double breadth;
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
class Circle extends Shape{
    double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
public class AbstractClassRectangleCircle {
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=20;
        System.out.println("Area of Rectangle is : "+r.area());
        System.out.println("Perimeter of Rectangle is : "+r.perimeter());

        Circle c=new Circle();
        c.radius=23;
        System.out.println("Area of Circle is : "+c.area());
        System.out.println("Perimeter of Circle is : "+c.perimeter());
    }
}

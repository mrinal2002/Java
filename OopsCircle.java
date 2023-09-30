class Circle{
    public double radius;

    double area(){
        return Math.PI*radius*radius;
    }
    double perimeter(){
        return 2*Math.PI*radius;
    }
}

public class OopsCircle {
    public static void main(String args[]){
        Circle c1=new Circle();
        c1.radius=3.4;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}

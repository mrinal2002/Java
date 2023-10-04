class circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class Cylinder extends circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
class InheritanceCircleCyclinder{
    public static void main(String args[]){
        Cylinder c1=new Cylinder();
        c1.radius=4;
        c1.height=5;
        System.out.println("Volume is : "+c1.volume());
        System.out.println("Area of Cylinder is : "+c1.area());
    }
}
class Rectangle{
    private int length;
    private int breadth;

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }

    public void setLength(int l){
        if(l>0){
            length=l;
        }
        else{
            length=0;
        }
    }
    public void setBreadth(int b){
        if(b>0){
            breadth=b;
        }
        else{
            breadth=0;
        }
    }

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class OopsGetterSetterRectangle {
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        r1.setLength(5);
        r1.setBreadth(6);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.getBreadth());
        System.out.println(r1.getBreadth());
    }
}

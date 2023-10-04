class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int ll,int bb){
        setLength(ll);
        setBreadth(bb);
    }

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int b){
        if(b>0){
            breadth=b;
        }
        else{
            breadth=0;
        }
    }
    public void setLength(int l){
        if(l>0){
            length=l;
        }
        else{
            length=0;
        }
    }

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class OopsConstructorRectangle {
    public static void main(String args[]){
        Rectangle r1=new Rectangle(5, 06);
        Rectangle r2=new Rectangle(-9,9);
        
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        System.out.println(r2.area());
        System.out.println(r2.perimeter());
    }
}

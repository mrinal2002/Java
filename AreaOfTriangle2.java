import java.util.*;
import java.lang.*;
public class AreaOfTriangle2 {
    public static void main(String[] args){
        int a,b,c;
        System.out.println("Enter first side of the triangle ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter second side of the triangle ");
        b=sc.nextInt();
        System.out.println("Enter third side of the triangle ");
        c=sc.nextInt();
        float sum;
        double area;
        sum=(a+b+c)/2f;
        area=Math.sqrt(sum*(sum-a)*(sum-b)*(sum-c));
        System.out.println("Area of the triangle is "+area);
    }
}

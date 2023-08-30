import java.util.*;
public class QuadraticEquation {
    public static void main(String[] args){
        int a,b,c;
        double r1,r2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st value ");
        a=sc.nextInt();
        System.out.println("enter 2nd value ");
        b=sc.nextInt();
        System.out.println("enter 3rd value ");
        c=sc.nextInt();
        r1=((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        r2=((-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        System.out.println("value of r1 is "+r1);
        System.out.println("value of r2 is "+r2);
    }
}

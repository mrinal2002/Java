import java.util.*;
public class UseRadix {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        //it converted binary to decimal numbers
        System.out.println("enter binary number : ");
        sc.useRadix(2);
        int x=sc.nextInt();
        System.out.println("decimal value will be "+x);
    }
}

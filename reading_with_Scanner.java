import java.util.*;
public class reading_with_Scanner {
    public static void main(String arg[]) {
        System.out.println("enter a number :");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("you type : "+x);

        System.out.println("enter a float number :");
        float y=sc.nextFloat();
        System.out.println("you type : "+y);

        String z;
        System.out.println("enter a name :");
        z=sc.nextLine();
        System.out.println("you type : "+z);



        
    }
}

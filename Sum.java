import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a,b,res;
        System.out.println("Enter two no : ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        res=a+b;
        System.out.println("the sum of two no is : "+ res);
    }
}

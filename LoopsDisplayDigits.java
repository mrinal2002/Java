import java.util.Scanner;

public class LoopsDisplayDigits {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            int r=n%10;
            System.out.println(r);
            n/=10;
        }
    }
}

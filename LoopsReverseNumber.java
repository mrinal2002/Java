import java.util.Scanner;

public class LoopsReverseNumber {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println(rev);
    }
}

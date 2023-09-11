import java.util.Scanner;

public class LoopsPalindrome {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int p=n;
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev==p){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not Palindrome number");
        }
    }
}

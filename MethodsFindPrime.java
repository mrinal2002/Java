import java.util.Scanner;

public class MethodsFindPrime {
   static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(isPrime(n));
    }
}

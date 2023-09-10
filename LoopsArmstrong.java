import java.util.Scanner;

public class LoopsArmstrong {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        int sum=0;
        n=sc.nextInt();
        int p=n;
        while(n!=0){
            int r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(sum==p){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}

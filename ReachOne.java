import java.util.Scanner;

public class ReachOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number ");
        int n=sc.nextInt();
        int count=1;
        boolean flag=true;
        while(flag){
            int sum=0;
            while(n!=0){
                sum+=n%10;
                n=n/10;
            }
            if(sum/10!=0){
                n=sum;
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}

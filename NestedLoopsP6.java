import java.util.Scanner;

public class NestedLoopsP6 {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++count+" ");
            }
            System.out.println("");
        }
    }
}

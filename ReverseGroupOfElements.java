import java.util.Scanner;

public class ReverseGroupOfElements {
    public static void main(String args[]){
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i+=k){
            int start=i;
            int end=Math.min(i+k-1,n-1);
            while(start<=end){
                int t=a[start];
                a[start]=a[end];
                a[end]=t;
                start++;
                end--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}

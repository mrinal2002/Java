import java.util.Scanner;

public class PairCountDefference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int res=Math.abs(arr[i]-arr[j]);
                if(res==k){
                    count++;
                }
            }
        }
        System.out.println("pair count will be: "+count);
    }
}

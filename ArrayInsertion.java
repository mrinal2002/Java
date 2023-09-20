import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int key=100;
        int index=3;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        n=n+1;
        arr[index]=key;
       
        for(int i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

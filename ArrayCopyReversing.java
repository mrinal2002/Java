import java.util.Scanner;

public class ArrayCopyReversing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=n-1,j=0;i>=0;i--,j++){
            arr2[j]=arr1[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

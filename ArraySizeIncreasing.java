import java.util.Scanner;

public class ArraySizeIncreasing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[2*n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=arr1[i];
        }
        arr1=arr2;
        arr2=null;
        System.out.println(arr1.length);
    }
}

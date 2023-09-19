import java.util.Scanner;

public class ArraySearching {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int key=5;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int f=1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("find at "+i);
                f=0;
                break;
            }
        }
        if(f==1){
            System.out.println("Element not found");
        }
    }
}

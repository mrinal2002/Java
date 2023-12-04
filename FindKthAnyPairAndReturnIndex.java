import java.util.HashMap;
import java.util.Scanner;

public class FindKthAnyPairAndReturnIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], i);
            }
            else{
                hm.put(arr[i], i);
            }
        }
        System.out.println(hm);
    }
}

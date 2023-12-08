import java.util.HashMap;
import java.util.Scanner;

public class KthDistinctElement {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])==1){
                count++;
                if(count==k){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class MaxFrequencyInArray {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
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
                hm.put(arr[i], 1);
            }
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(hm.get(arr[i]),maxi);
        }
        System.out.println(hm);
        //System.out.println(maxi);
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])==maxi){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

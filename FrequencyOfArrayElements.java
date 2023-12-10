import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
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
        
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(hm2.containsKey(arr2[i])){
                hm2.put(arr2[i], hm2.get(arr2[i])+1);
            }
            else{
                hm2.put(arr2[i],1);
            }
        }
        System.out.println(hm.equals(hm2));
    }
}

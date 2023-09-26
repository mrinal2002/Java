import java.util.Scanner;

public class ArraySortingObjectString {
    public static void main(String args[]){
        String arr[]={"java","python","pascal","ada","basic"};
        java.util.Arrays.sort(arr);  //include inbuild function to sort the string..
        for(String x:arr){
            System.out.println(x);
        }
    }
}

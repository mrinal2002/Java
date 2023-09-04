import java.util.Scanner;

public class ConditionsEvenOdd {
    public static void main(String args[]){
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        if(x%2==0){
            System.out.println(x+" is a even no");
        }
        else{
            System.out.println(x+" is a odd number");
        }
    }
}

import java.util.Scanner;

public class LoopsNumbersInWord {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String str="";
        while(n!=0){
            int r=n%10;
            str+=r;
            n=n/10;
        }
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            switch(c){
                case '0':
                System.out.print("Zero ");
                break;
                case '1':
                System.out.print("One");
                break;
                case '2':
                System.out.print("Two ");
                break;
                case '3':
                System.out.print("Three ");
                break;
                case '4':
                System.out.print("Four ");
                break;
                case '5':
                System.out.print("Five ");
                break;
                case '6':
                System.out.print("Six ");
                break;
                case '7':
                System.out.print("Seven ");
                break;
                case '8':
                System.out.print("Eight ");
                break;
                case '9':
                System.out.print("Nine ");
                break;

            }
        }
    }
}

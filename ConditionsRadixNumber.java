import java.util.Scanner;

public class ConditionsRadixNumber {
    public static void main(String args[]){
        String num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextLine();
        if(num.matches("[01]+")){
            System.out.println("Binary number");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Octal number");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("Decimal number");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("Hexa number");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}

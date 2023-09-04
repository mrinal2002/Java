import java.util.Scanner;

public class ConditionsGrades {
    public static void main(String args[]){
        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        int total=m1+m2+m3;
        int avg=total/3;
        if(avg>=70){
            System.out.println("A");
        }
        else if(avg<=69 && avg>=50){
            System.out.println("B");
        }
        else if(avg<=49 && avg>=30){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
    }
}

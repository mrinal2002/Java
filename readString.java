import java.util.Scanner;

public class readString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name;
        System.out.println("Write your name : ");
        name=s.nextLine();
        System.out.println("Welcome mr/miss : "+name);
    }
}

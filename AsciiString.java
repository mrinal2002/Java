import java.util.Scanner;

public class AsciiString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t!=0) {
            String str;
            System.out.println("enter a strig");
            str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    System.out.print(' ');
                } else {
                    System.out.print((int) str.charAt(i));
                }
            }
            t--;
        }
    }

}

import java.util.Scanner;

class ScoreException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t, i, j = 0;
        t = Integer.parseInt(s.nextLine().trim());
        String str;
        int n;
        while (t-- > 0) {
            j=0;
            str = s.nextLine();
            try {

                n = s.nextInt();
                if (n < 0 || n > 100) {
                    j=1;
                    throw new Exception("s");
                }
                System.out.println("Correct!");
            } catch (Exception e) {
                if(j==0){

                    System.out.println("score cant be other than digit");
                }
                if (e.getMessage() == "s") {
                    System.out.println("score range invalid");
                }
            }
        }
    }
}
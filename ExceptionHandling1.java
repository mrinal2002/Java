public class ExceptionHandling1 {
    public static void main(String args[]){
        int a,b,c;
        try{
            a=10;
            b=0;
            c=a/b;
            System.out.println(c);
            System.out.println("Bye");
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero not allowed "+e);
        }
    }
}

public class MethodsFindGCD {
    static int GCD(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    public static void main(String args[]){
        int a=35,b=56;
        System.out.println(GCD(a,b));
    }
}

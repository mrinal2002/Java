public class MethodsMax {
    static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String args[]){
        int a=10,b=14;
        System.out.print(max(a,b));
    }
}

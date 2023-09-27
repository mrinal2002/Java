public class MethodsByObjects {
    int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String arsg[]){
        int a=10,b=23;
        MethodsByObjects mt=new MethodsByObjects();
        System.out.println(mt.max(a,b));
    }
}

public class MethodsOverLoading {
    static int max(int x,int y){
        return x>y?x:y;
    }
    static float max(float x,float y){
        return x>y?x:y;
    }
    static int max(int x,int y,int z){
        return x>y && x>z?x:(y>z?y:z);
    }
    public static void main(String args[]){
        System.out.println(max(29,454));
        System.out.println(max(3.4f,54.4f));
        System.out.println(max(2,5,33));
        System.out.println(max(3,5));
    }
}

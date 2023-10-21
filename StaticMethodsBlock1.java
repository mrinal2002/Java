public class StaticMethodsBlock1 {
    static{
        System.out.println("block1");
    }
    public static void main(String args[]){
        System.out.println("Main");
    }
    static{
        System.out.println("block2");
    }
}

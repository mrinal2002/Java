class Test {
    static {
        System.out.println("Block1 inside test");
    }
    static {
        System.out.println("Block2 inside test");
    }
}

public class StaticMethodsBlock2 {
    public static void main(String args[]) {
        Test t = new Test();
        System.out.println("Main");
    }
}

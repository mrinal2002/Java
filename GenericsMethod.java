public class GenericsMethod {
    static <E> void show(E[] list){
        for(E x:list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show(new String[]{"hii","world"});
        show(new Integer[]{10,34,34});
    }
}

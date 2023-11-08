public class MultiThreading2 implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" hiii");
            i++;
        }
    }
    public static void main(String[] args) {
        MultiThreading2 mt=new MultiThreading2();
        Thread t=new Thread(mt);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
}

class Myclass extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i +" hello");
            i++;
        }
    }
}
public class MultiThreading1 {
    public static void main(String[] args) {
        Myclass mc=new Myclass();
        mc.start();
        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
}

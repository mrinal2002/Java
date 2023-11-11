class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
}
public class MultiThreadingMethods1 {
    public static void main(String[] args) {
        MyThread mt=new MyThread("my thread 1");
        System.out.println(mt.getName());
        System.out.println(mt.getPriority());
        //System.out.println(mt.getId());
        System.out.println(mt.isAlive());
        mt.interrupt();
        System.out.println(mt.isInterrupted());
        System.out.println(mt.getState());
    }
}

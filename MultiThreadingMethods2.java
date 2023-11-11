class MyThread extends Thread {
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
            try {
                MyThread.sleep(2000);  // it provides the duration of executing any threads after how many times the process will be executing here 2000 means 2seconds.
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadingMethods2 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}

class Mydata {
   synchronized public void display(String str) {
       // synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        //}
    }
}

class MyThread1 extends Thread {
    Mydata d;

    public MyThread1(Mydata data) {
        d = data;
    }

    public void run() {
        d.display("Hello");
    }
}

class MyThread2 extends Thread {
    Mydata d;

    public MyThread2(Mydata data) {
        d = data;
    }

    public void run() {
        d.display("World");
    }
}

public class MultiThreadingMonitorSynchronization {
    public static void main(String[] args) {
        Mydata d = new Mydata();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();
    }
}

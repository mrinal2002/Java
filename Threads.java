import java.lang.*;
class MyThreads extends Thread{
    int sum=0;
    public void run(){
        for(int i=1;i<=10000;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
public class Threads {
    public static void main(String args[]){
        MyThreads mt=new MyThreads();
        mt.start();
        MyThreads mt2=new MyThreads();
        mt2.start();
        try{
            mt.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("welcome");
    }
}

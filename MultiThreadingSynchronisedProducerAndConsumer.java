class Mydata{
    int value;
    boolean flag=true;
    synchronized public void set(int v){
        while(flag!=true){
            try{
                wait();
            }catch(Exception e){}
        }
        value=v;
        flag=false;
        notify();
    }
    synchronized public int get(){
        int x=0;
        while(flag!=false){
            try{
                wait();
            }catch(Exception e){}
        }
        x=value;
        flag=true;
        notify();
        return x;
    }
}
class Producer extends Thread{
    Mydata data;
    public Producer(Mydata d){
        data=d;
    }
    public void run(){
        int count=1;
        while(true){
            data.set(count);
            System.out.println("producer "+count);
            count++;
        }
    }
}
class Consumer extends Thread{
    Mydata data;
    public Consumer(Mydata d){
        data=d;
    }
    public void run(){
        int value;
        while(true){
            value=data.get();
            System.out.println("consumer "+value);
        }
    }
}
public class MultiThreadingSynchronisedProducerAndConsumer {
    public static void main(String[] args) {
        Mydata d=new Mydata();
        Producer p=new Producer(d);
        Consumer c=new Consumer(d);
        p.start();
        c.start();
    }
}

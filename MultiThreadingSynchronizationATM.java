class ATM{
  synchronized  public void checkBalance(String name){
        System.out.println(name+" checkingBAL");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
        System.out.println("Balance check succcess");
    }
    public void withdraw(String name,int amt){
        System.out.println(name+" Withdraw");
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
        System.out.println(amt);
    }
}
class Customer extends Thread{
    String name;
    int amount;
    ATM a;
    Customer(String name,int amount,ATM a){
        this.name=name;
        this.amount=amount;
        this.a=a;
    }
    public void useATM(){
        a.checkBalance(name);
        a.withdraw(name, amount);
    }
    public void run(){
        useATM();
    }
}
public class MultiThreadingSynchronizationATM {
    public static void main(String[] args) {
        ATM a=new ATM();
        Customer c1=new Customer("Mrinal", 1000, a);
        Customer c2=new Customer("Tushar", 2990, a);
        c1.start();
        c2.start();
    }
}

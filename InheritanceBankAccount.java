class Account{
    private String accno;
    private String name;
    public int balance;
    private String phno;
    public Account(){

    }

    public Account(String accon,String name,int balance,String phno){
        this.accno=accon;
        this.name=name;
        this.balance=balance;
        this.phno=phno;
    }
    public int getBalance(){
        return balance;
    }
    public void setPhno(String phno){
        this.phno=phno;
    }
}
class SavingAccount extends Account{
    public void deposite(int amt){
       balance+=amt;
    }
    public void withdraw(int amt){
        balance-=amt;
    }
}
class LoanAccount extends Account{
    public void payEmi(int amt){
        balance-=amt;
    }
    public void repay(int amt){
        if(balance==amt){
            balance=0;
        }
    }
}

public class InheritanceBankAccount {
    public static void main(String args[]){
        Account a1=new Account("1126", "Mrinal", 1000, "77588489");
        System.out.println(a1.getBalance());
        SavingAccount s1=new SavingAccount();
        s1.deposite(50);
        System.out.println(s1.getBalance());
        LoanAccount l1=new LoanAccount();
        l1.payEmi(500);;
        System.out.println(l1.getBalance());
    }
}

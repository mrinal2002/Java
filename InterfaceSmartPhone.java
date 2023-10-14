class Phone{
    public void call(){
        System.out.println("Phone call");
    }
    public void sms(){
        System.out.println("Phone sms");
    }
}

interface Icamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void stop();
}

class SmartPhone extends Phone implements IMusicPlayer,Icamera{   // here we achieve the multiple inheritance by using interfaces;
    public void click(){
        System.out.println("SmartPhone clicking photo");
    }
    public void record(){
        System.out.println("SmartPhone recording..");
    }
    public void play(){
        System.out.println("SmartPhone Play music..");
    }
    public void stop(){
        System.out.println("SmartPhone stop music..");
    }
    public void videoCall(){
        System.out.println("SmartPhone videoCall..");
    }
}

public class InterfaceSmartPhone {
    public static void main(String args[]){
        SmartPhone sp=new SmartPhone();
        sp.call();
        sp.click();
        sp.play();
        sp.stop();
        sp.sms();
        sp.call();
        
        Icamera ic=sp;
        ic.click();
        ic.record();

        IMusicPlayer ip=sp;
        ip.play();
        ip.stop();

        Phone p=new Phone();
        p.call();
        p.sms();
    }
}

class My{
    final int MIN=1;
    static final int NORMAL;
    final int MAX;

    static{
        NORMAL=5;
    }
    My(){
        MAX=10;
    }
}
public class FinalKeyWord {
    public static void main(String args[]){
        My m=new My();
        System.out.println(m.MAX);
        System.out.println(m.MIN);
        System.out.println(m.NORMAL);
    }
}

class coffeMachin{
    private float coffeqty;
    private float mildqty;
    private float waterqty;
    private float sugerqty;

    static private coffeMachin our=null;

    private coffeMachin(){
        coffeqty=1;
        mildqty=1;
        waterqty=1;
        sugerqty=1;
    }
    public void fillWater(float qty){
        waterqty=qty;
    }
    public void fillSuger(float qty){
        sugerqty=qty;
    }
    public float getCoffe(){
        return 0.3f;
    }
    static coffeMachin getInstance(){
        if(our==null){
            our=new coffeMachin();
        }
        return our;
    }
}
public class SingleTonclass {
    public static void main(String args[]){
        coffeMachin m1=coffeMachin.getInstance();
        coffeMachin m2=coffeMachin.getInstance();
        coffeMachin m3=coffeMachin.getInstance();

        System.out.println(m1+ " "+m2+" "+m3);
        if(m1==m2 && m2==m3){
            System.out.println("same");
        }
    }
}

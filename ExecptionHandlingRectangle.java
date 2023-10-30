public class ExecptionHandlingRectangle {

    static int area(int l,int b) throws Exception{
        if(l<0 || b<0){
            throw new Exception("length and breadth should not be negative");
        }
        int a=l*b;
        return a;
    }

    static void meth1(){
        try{
            int a=area(-10,4);
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        meth1();
    }
}

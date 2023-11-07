public class ExceptionHandlingFinallyBlock2 {

    static void meth1() throws Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("final message");
        }
    }
    public static void main(String args[]){
        try{
            meth1();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}

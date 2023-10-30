class MyException extends Exception{
    public String toString(){
        return "Length and breadth can't be negative";
    }
}
public class ExceptionHandlingUserDefine {

    static int area(int l,int b)throws MyException{
        if(l<0 || b<0){
            throw new MyException();
        }
        int a=l*b;
        return a;
    }

    static void meth1(){
        try{
            int a=area(-19,8);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String args[]) {
        meth1();
    }
}

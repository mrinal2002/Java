public class MethodsUpdatedValue {
    static void update(int A[]){
        A[2]=199;
    }
    public static void main(String args[]){
        int A[]={2,4,5,6,23};
        update(A);
        System.out.println(A[2]);
    }
}

public class WrapperClassFirst {
    public static void main(String[] args) {

           int a=10;
           Integer b=a;  // auto boxing
           int p=b;  // auto unboxing
           System.out.println(p+" "+b);

        Integer i=180;
        System.out.println(Integer.bitCount(i));
        System.out.println(Integer.parseInt("1342"));
        System.out.println(Integer.toBinaryString(10));  // return the binary value in the given string
        Integer j=Integer.valueOf(180);
        System.out.println(i.equals(j));  // it check the value not the object or any reference
        int k=180;
        System.out.println(j.equals(k));
        System.out.println(Integer.max(34, 67));  // return the maximum value
        System.out.println(Integer.min(34,55));   // return the minimum value;
    }
}

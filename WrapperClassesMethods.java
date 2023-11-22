public class WrapperClassesMethods {
    public static void main(String[] args) {
        float f1=13.3f;
        Float F=13.3f;
        System.out.println(F.equals(f1));   // check only there values are same or not
        Float F2=13.4f/0;
        System.out.println(F2.isInfinite());  // check infinite value or not ?
        System.out.println(F2.POSITIVE_INFINITY);

        Float F3=(float)Math.sqrt(-1);  
        System.out.println(F3.isNaN());   // check this value is number or not ?
    }
}

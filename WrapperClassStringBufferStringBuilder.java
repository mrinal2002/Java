public class WrapperClassStringBufferStringBuilder {
    public static void main(String[] args) {
        String s1=new String("hello");
        StringBuffer s2=new StringBuffer("hello");
        StringBuffer s3=new StringBuffer("hello");

        s1.concat("world1");
        s2.append("world2");
        s3.append("world3");
        s3.insert(2,"*ch*");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

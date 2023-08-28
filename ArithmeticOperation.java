public class ArithmeticOperation {
    public static void main(String[] args) {
        float a = 10.5f, b = 5.2f; // we should declared :f: after the value otherwise it gives us a error or by
                                   // default it return as a double value
        float c = a / b;
        float r = a % b;
        System.out.println(c);
        System.out.println(r);

        short e = 10;
        byte f = 10;

        // short g=e+f; //it given me a error becouse short and byte by default return
        // as a int type value.so we should return as int type.
        int g = e + f;
        System.out.println(g);


        int p=90;
        char q=10;
        //char s=p+q;   //it given a error becouse char type not convert int as a char.so we should return as int type
        int s=p+q;
        System.out.println(s);

        float x=17.5f;
        double y=3.9d;
        //float z=x/y;  //it given me a error becouse float can't return addition of double type value becouse byte of the float and double is same so by default java compile as double value so we should return double type value.
        double z=x/y;
        System.out.println(z);
    }
}

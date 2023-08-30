public class Printing {
    public static void main(String args[]){
        int x=10,y=20;
        float f=12.56f;
        String str="java";
        System.out.println(x+y);
        System.out.println(x+y+" Sum");  // first x and y 2 int value is added and than this addition concat with "sum" string
        System.out.println("Sum "+x+y);  // first "sum " string concat with x integer value and than concatinated string added with y int value;
        System.out.println("Sum of "+x+" and "+y+" is "+(x+y));

        // printf method-->

        System.out.printf("int valu is %d float value is %f string value is %s\n",x,f,str);
        System.out.printf("octal no of 10 is %o \n",x);
        System.out.printf("hexadecimal no of 10 is %x \n",x);
        System.out.printf("%1$d %2$");
    }
}

public class Literals {
    public static void main(String arg[]){
        //int literals --
        byte b1=10;
        byte b2=0b1010;
        byte b3=012;
        byte b4=0XA;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


        // long literals --

        //long l=999999999999; // it shows me an error becouse the number size is too large than the capacity of integer type
        long l=999_99999_9999L; // now its work properly becouse it is now define the long and we can write underscore in middle of any number like this
        System.out.println(l);
        //int i=125L; //we can't declared variable like this becouse int cant be hold the bigger size of long


        //double and float literals --

        //float f=2.5;   // it shows an error becouse by default any point of decimal value is double so float cant contain any double value
        float f=2.5f;
        System.out.println(f);

        double d=273_83.56;
        System.out.println(d);

    }
}

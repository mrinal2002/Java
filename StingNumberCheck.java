public class StingNumberCheck {
    public static void main(String args[]){
        int b=101010110;
        String str1="234AB";
        String str2="B23A4Z";
        String str=String.valueOf(b);
        System.out.println(str.matches("[01]+")); // check the number is binary or not
        System.out.println(str1.matches("[0-9A-F]+")); // check hexa decimal value;
        System.out.println(str2.matches("[0-9A-F]+"));
    }
}

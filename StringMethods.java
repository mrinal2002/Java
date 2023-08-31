public class StringMethods {
    public static void main(String args[]){
        String str="www.abcd.org";
        String str1="java";
        String str2=new String("java");
        System.out.println(str.startsWith("www"));  // it checks the first value of the given string
        System.out.println(str.endsWith("org"));   // it checks the last value of the given string
        System.out.println(str.charAt(4));   // it checks which value is stored in index no 4
        System.out.println(str.indexOf("a"));  // it checks "a" is located in which index
        System.out.println(str.lastIndexOf("w")); // it checks "w" from the last index
        System.out.println(str.equals(str1));  // equality check 
        System.out.println(str1.equals(str2));
    }
}

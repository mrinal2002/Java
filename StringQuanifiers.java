public class StringQuanifiers {
    public static void main(String args[]){
        String str="";
        String str1="abcdef";
        String str2="abcd897";
        String str3="acc";
        System.out.println(str.matches("[a-z]*"));  // " * " means 0 or more time it could be 
        System.out.println(str1.matches("[a-z]*"));
        System.out.println(str2.matches("[a-z]*"));
        System.out.println(str3.matches("[abc]{3}"));   // {3} means exactly 3 characters should be return 
        System.out.println(str1.matches("[a-z]{3,6}"));  // {3,6} means 3 is the minimum string that requred and maximum 6 character
     }
}

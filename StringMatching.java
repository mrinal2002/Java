public class StringMatching {
    public static void main(String args[]){
        String str1="a";
        String str2="abc";
        String str3="bca";
        String str4="a9";
        System.out.println(str1.matches("."));  // it check in the string a single value present or not
        System.out.println(str2.matches("[abc]"));
        System.out.println(str3.matches("[abc]"));
        System.out.println(str1.matches("[a-z0-9]"));
        System.out.println(str4.matches("[a-z][0-9]"));
    }
}

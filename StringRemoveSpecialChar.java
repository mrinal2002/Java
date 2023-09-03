public class StringRemoveSpecialChar {
    public static void main(String args[]){
        String str="M@r%i*n$a#l";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));  // if not berween the a to z range or 0 to 9 range omit the value and replace by null
    }
}

public class StringChar {
    public static void main(String args[]){
        char c[]={'A','B','D','E'};
        byte b[]={65,67,68,69};
        String st="JAva";
        String st1="   Java   ";
        String st2="Wellcome";
        String str=new String(c);
        String str1=new String(b);
        String str2=new String(b,1,2);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(st.toLowerCase());  // it converted the text into all lower case
        System.out.println(st.toUpperCase());  // it converted the text into all upper case
        System.out.println(st1.trim());   // the trime methods remove all spaces froma a string 
        System.out.println(st2.substring(4,6));  // cut the sub string from learge string
        System.out.println(st2.replace('e','k'));  // it replece new character from string
    }
}

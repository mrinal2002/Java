import java.util.HashMap;

public class FrequencyOfAllCharacters {
    public static void main(String[] args) {
        String str="codequotient";
        int n=str.length();
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        String st1="";
        String st2="";
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(hm.get(ch)>1){
                int flag=0;
                for(int j=0;j<st2.length();j++){
                    if(st2.charAt(j)==ch){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    st1+=ch;
                    st2+=ch;
                }
            }
            else{
                st1+=ch;
                st2+=ch;
            }
        }
        System.out.println(st1);
        for(int i=0;i<st1.length();i++){
            char ch=st1.charAt(i);
            System.out.print(ch);
            System.out.print(hm.get(ch)+" ");
        }
    }
}

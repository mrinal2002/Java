public class FrequencyChar {
    public static void main(String[] args) {
        String str="axbfbxyaa";
        int n=str.length();
        int hash[]=new int[26];
        for(int i=0;i<n;i++){
            hash[str.charAt(i)-'a']++;
        }
        int flag=0;
        for(int i=0;i<26;i++){
            if(hash[i]==1){
                int res=i+97;
                char res1=(char)res;
                System.out.println(res1);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("not found");
        }
    }
}

public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {
        try {


        String str1=strs[0];
        String str2=strs[1];
        String str3=strs[2];
        int len=str1.length();
        int ii=0;
        for(int i=0;i<len;i++){
            if (str1.charAt(i)==str2.charAt(i)&str1.charAt(i)==str3.charAt(i)){
                ii++;
            }else {
                break ;
            }
        }
        if (ii==0){
            return "";
        }
        return str1.substring(0,ii);
        }catch (Throwable e){
            e.printStackTrace();
        }
        return "";
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }



    public static void main(String[] args) {
//        String strs[]={"lower","flow","fliwht"};
//        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
        String st1="121";
        String st2="124444";
        System.out.println(st2.indexOf(st1));
    }
}

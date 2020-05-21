package club.banyuan.blog.java;

import java.util.Arrays;

public class Java19 {
    public String sortString(String s) {
        StringBuilder res=new StringBuilder();
        int[] a=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for (int count=0;count<s.length();count++){
            for (int i = 0; i < 26; i++) {
                if(a[i]==0){
                    continue;
                }else {
                    res.append((char)('a'+i));
                    a[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if(a[i]==0){
                    continue;
                }
                else{
                    res.append((char)('a'+i));
                    a[i]--;
                }
            }
        }
        return res.toString();
    }
}

package club.banyuan.blog.java;
//给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
import java.util.ArrayList;
import java.util.List;

public class Java8 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() <= 1 || B.length() <= 1) {
            return false;
        }
        char s1[] = A.toCharArray();
        char s2[] = B.toCharArray();
        int m = 0;
        List list = new ArrayList();

        if (s1.length != s2.length) {
            return false;
        }
        if (s1.length == s2.length && s1.length == 2) {
            if (s1[0] == s1[1] && A.equals(B)) {
                return true;
            } else if (s1[0] == s2[1] && s1[1] == s2[0]) {
                return true;
            } else {
                return false;
            }
        }
        if (s1.length == s2.length && s1.length > 2) {
            for (int i = 0; i < s1.length; i++) {
                if (s1[i] != s2[i]) {
                    m++;
                    list.add(s1[i]);
                    list.add(s2[i]);
                } else {
                    continue;
                }
            }
            if (m != 2 && m != 0) {
                return false;
            } else if (m == 2) {
                if (list.get(0) == list.get(3) && list.get(1) == list.get(2)) {
                    return true;
                } else {
                    return false;
                }
            } else if (m == 0) {
                int count = 0;
                for (int k = 0; k < s1.length; k++) {
                    char ca1 = s1[k];
                    for (int l = 0; l < s1.length; l++) {
                        char ca2 = s1[l];
                        if (ca1 == ca2) {
                            count++;
                        }
                    }
                }
                if (count > 4) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
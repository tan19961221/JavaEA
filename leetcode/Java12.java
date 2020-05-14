package club.banyuan.blog.java;
//给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
public class Java12 {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i<=(int)Math.sqrt(c); i++) {
            double b = Math.sqrt(c - i * i);
            if (b == (int) b)
                return true;
        }
        return false;
    }

}

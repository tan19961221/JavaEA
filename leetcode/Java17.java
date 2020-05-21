package club.banyuan.blog.java;

public class Java17 {
    public int waysToStep(int n) {
        if (n <= 2) {
            return n;
        }
        int[] a = new int[n+1];
        a[1] = 1;
        a[2] = 2;
        a[3] = 4;
        for (int i = 4; i < n+1; i++) {
                        a[i] = (a[i-1] + (a[i-2] + a[i-3]) % 1000000007) % 1000000007;
        }
        return a[n];
    }
}

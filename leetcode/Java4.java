package club.banyuan.blog.java;
//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

public class Java4 {
    public int climbStairs(int n) {
//        if (n == 1 || n == 2) {
//            return n;
//        }
//        int a = 1;
//        int b = 2;
//        for (int i = 3; i <= n; i++) {
//            int tmp = b;
//            b = a + b;
//            a = tmp;
//        }
//        return b;

        if (n == 1) {
            return 1;
        }
        int[] a = new int[n + 1];
        a[1] = 1;
        a[2] = 2;
        for (int i = 3; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];


//        if (n==1){
//            return 1;
//        }else if (n==2) {
//            return 2;
//        }else {
//            return climbStairs(n-1)+climbStairs(n-2);
//        }
    }
}

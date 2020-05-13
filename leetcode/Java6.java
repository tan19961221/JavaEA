package club.banyuan.blog.java;
//假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
//
//给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
//
import java.util.ArrayList;

public class Java6 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();

        int sum = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                a.add(i);
            }
        }
        if (a.size() == 0) {
            sum = (flowerbed.length + 1) / 2;
            if (sum >= n) {
                return true;
            } else {
                return false;
            }
        }
        else {
            for (int j = 0; j < a.size() - 1; j++) {
                int m = 0;
                m = a.get(j + 1) - a.get(j) - 1;
                b.add(m);
            }
            for (int z = 0; z < b.size(); z++) {
                int y = 0;
                if (b.get(z) == 1 && b.get(z) == 2) {
                    y = 0;
                    c.add(y);
                } else if (b.get(z) > 2) {
                    if (b.get(z) % 2 == 0) {
                        y = (b.get(z) - 2) / 2;
                        c.add(y);
                    } else if (b.get(z) % 2 == 1) {
                        y = (b.get(z) - 1) / 2;
                        c.add(y);
                    }
                }
            }
            int sum3 = 0;
            for (int x = 0; x < c.size(); x++) {
                sum3 += c.get(x);
            }
            int sum1 = 0;
            int sum2 = 0;

            if (flowerbed[0] == 0) {
                sum1 = a.get(0) / 2;
            }

            if (flowerbed[flowerbed.length - 1] == 0) {
                int cha = flowerbed.length - 1 - a.get(a.size() - 1);
                sum2 = cha / 2;
            }
            sum = sum1 + sum2 + sum3;
            return sum>=n;
        }
    }

    public static void main(String[] args) {
        Java6 java6 = new Java6();
        int[] a = {0, 0, 0, 1, 0, 0};
        int b = 2;
        boolean m = java6.canPlaceFlowers(a, b);
        System.out.println(m);
    }
}

//                if (cha == 1) {
//                    sum2 = 0;
//                } else if (cha > 1) {
//                    if (cha % 2 == 0) {
//                        sum2 = cha / 2;
//                    } else if (cha % 2 == 1) {
//                        sum2 = (cha - 1) / 2;
//                    }
//                }

//                if (a.get(0) == 1) {
//                    sum1 = 0;
//                } else if (a.get(0) > 1) {
//                    if (a.get(0) % 2 == 0) {
//                        sum1 = a.get(0) / 2;
//                    } else if (a.get(0) % 2 == 1) {
//                        sum1 = (a.get(0) - 1) / 2;
//                    }
//                }

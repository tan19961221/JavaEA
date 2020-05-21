package club.banyuan.blog.java;

import java.util.ArrayList;

//5个质数1370 求这五个数
public class Java16 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] isPrimes = new boolean[1371];
        for (int i = 2; i < isPrimes.length; i++) {
            isPrimes[i] = true;
        }

        for (int i = 3; i <= 1370; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimes[i] = false;
                    break;
                }
            }
        }
        for (int i = 2; i < isPrimes.length; i++) {
            if (isPrimes[i]) {
                list.add(i);
            }
        }
        boolean flag = true;

        for (int m1=0;m1<list.size();m1 ++){
            for (int m2=0;m2<list.size();m2 ++){
                for (int m3=0;m3<list.size();m3 ++){
                    for (int m4=0;m4<list.size();m4 ++){
                        for (int m5=0;m5<list.size();m5 ++)
                        if (list.get(m1)+list.get(m2)+list.get(m3)+list.get(m4)+list.get(m5)==1370
                        &&(m1!=m2&&m1!=m3&&m1!=m4&&m1!=m5&&m2!=m3&&m2!=m4&&m2!=m5&&m3!=m4&&m3!=m5&&m4!=m5)){
                            System.out.println("五个数是："+list.get(m1)+","+list.get(m2)+","+list.get(m3)+","+list.get(m4)+","+list.get(m5));
//                            flag=false;
                        }
                    }
                }
            }
        }
    }

}

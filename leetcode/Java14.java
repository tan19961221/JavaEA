package club.banyuan.blog.java;

import java.util.ArrayList;
import java.util.Collections;

public class Java14 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < A[i].length; j++) {
                list.add(A[i][j]);
            }
            Collections.reverse(list);
            for (int a = 0; a < list.size(); a++) {
                A[i][a] = list.get(a);
            }
            for (int k = 0; k < A[i].length; k++) {
                if (A[i][k] == 0) {
                    A[i][k] = 1;
                } else {
                    A[i][k] = 0;
                }
            }
        }
        return A;

    }
}

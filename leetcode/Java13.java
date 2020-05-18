package club.banyuan.blog.java;

import java.util.ArrayList;

public class Java13 {
    public int minTimeToVisitAllPoints(int[][] points) {
        ArrayList<Integer> a = new ArrayList();

        for (int i=0;i<points.length-1;i++){
            int m=Math.abs(points[i+1][0]-points[i][0]);
            int n=Math.abs(points[i+1][1]-points[i][1]);
            if (m>=n){
                a.add(m);
            }else if(m<n){
                a.add(n);
            }
        }
        int sum=0;
        for (int j=0;j<a.size();j++){
            sum+=a.get(j);
        }

        return sum;
    }

}

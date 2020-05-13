package club.banyuan.blog.java;

public class Java5 {
    public int findRadius(int[] houses, int[] heaters) {
        int max=0;
        for (int i=0;i<houses.length;i++){
            for (int j=0;j<heaters.length;j++){
                int m=heaters[j]-houses[i];
                if (m>=max){
                    max=m;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Java5 java5=new Java5();
        int[] a={1,2,3,4};
        int[] b={1,4};
        int m=java5.findRadius(a,b);
        System.out.println(m);
    }
}

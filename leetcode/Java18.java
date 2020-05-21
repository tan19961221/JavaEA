package club.banyuan.blog.java;

import java.util.Arrays;

public class Java18 {
    public boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);
        int q = deck[0], sum = 0, len = 0;
        for(int i:deck){
            if(i == q)  sum++;
            else{
                deck[len++] = sum;
                sum = 1;
                q = i;
            }
        }
        deck[len++] = sum;
        int min_s = deck[0];
        for(int i = 0; i < len; i++){
            min_s = gcd(deck[i], min_s);
            if(min_s == 1){
                return false;
            }
        }
        return true;
    }
    public int gcd(int m, int n){
        return n==0 ? m:gcd(n, m%n);
    }
}

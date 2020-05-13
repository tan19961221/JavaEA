package club.banyuan.blog.java;
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
public class Java1 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if (x==0){
            return true;
        }
        int sum = 0;
        int num=x;
        while (num!=0){
            sum = sum * 10 + num % 10;
            num = num / 10;
        }
        if(sum==x){
            return true;
        }else{
            return false;
        }

    }
}



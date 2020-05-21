package club.banyuan.blog.java;

//581. 最短无序连续子数组
public class Java15 {
    public int findUnsortedSubarray(int[] nums) {
        boolean boo = isadd(nums);
        if (boo == true) {
            return 0;
        }
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            if (nums[0] > nums[1]) {
                return 2;
            } else {
                return 0;
            }
        }
        if (nums.length > 2) {
            int m1 = 0;
            int c=0;
            for (int m = 0; m < nums.length - 1; m++) {
                if (nums[m] <= nums[m + 1]) {
                    continue;
                } else if (nums[m]==nums[m+1]) {
                    c++;
                }else {
                    if (m<nums.length-2){
                        if (nums[m]<=nums[m+2]){
                            m1=m;
                            break;
                        }else {
                            m1=m+c;
                            break;
                        }
                    }
                    m1 = m;
                    break;
                }
            }
            int n1 = 0;
            int b = 0;
            for (int n = nums.length - 1; n > 0; n--) {
                if (nums[n] > nums[n - 1]) {
                    continue;
                } else if (nums[n] == nums[n - 1]) {
                    b++;
                } else {
                    if (n<nums.length-1){
                        if (nums[n - 1] <= nums[n + 1]) {
                            n1 = n;
                            break;
                        } else {
                            n1 = n + b;
                            break;
                        }
                    }
                    n1=n;
                    break;
                }
            }
            int number = n1 - m1 + 1;
            return number;
        }
        return 0;
    }

    public static boolean isadd(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//之所以是arr.length是为了避免越界
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

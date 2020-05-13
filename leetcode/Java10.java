package club.banyuan.blog.java;
//给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。
//
//我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，总满足 array[i] <= array[i + 1]。
//
public class Java10 {
    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }
        if (nums.length == 3) {
            if (nums[0] > nums[1] && nums[1] > nums[2]) {
                return false;
            } else {
                return true;
            }
        }
        if (nums.length > 3) {
            for (int j = 0; j < nums.length; j++) {
                int m = 0;
                int[] b = new int[nums.length - 1];
                for (int k = 0; k < nums.length; k++) {
                    if (k == j) {
                        continue;
                    }
                    b[m++] = nums[k];
                }
                boolean bo=isadd(b);
                if (bo==true){
                    return true;
                }
            }
            return false;
        }
        return true;
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

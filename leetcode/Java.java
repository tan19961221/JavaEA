package club.banyuan.blog.java;

public class Java {
    public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }else{
                        return new int[]{0};
                }
            }
        }
        return new int[]{0};
    }
}

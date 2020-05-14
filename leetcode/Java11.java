package club.banyuan.blog.java;

import java.util.HashMap;
import java.util.Map;

//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
public class Java11 {

    public int singleNumber(int[] nums) {
        int j = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null)
                map.put(nums[i], 1);
            else if (map.get(nums[i]) == 1)
                map.put(nums[i], 2);
        }
        for (Map.Entry<Integer, Integer> str : map.entrySet()) {
            if (str.getValue() == 1)
                j = str.getKey();
        }
        return j;
    }

}


package main.java.array;

import java.util.HashMap;
import org.junit.Test;

public class TwoSum {
    public class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++) {
                if(map.get(nums[i]) != null) {
                    int[] result = {map.get(nums[i]) , i};
                    return result;
                }
                map.put(target - nums[i], i);
            }
            int[] result = {};
            return result;
        }
    }
    public static class UnitTest {
        @Test
        public void test(){
            new TwoSum().new Solution().twoSum(new int[] {5, 75, 25}, 100);
        }
    }
}

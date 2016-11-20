package main.java.SearchAndSort;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Two Sum
 */
public class TargetSum {
    public class Solution {
        public int[] targetSum(int[] input, int target) {
            Arrays.sort(input); //O(nlogn)
            int start = 0;
            int end = input.length - 1;
            while (start < end) {
                int sum = input[start] + input[end];
                if (sum == target) {
                    int[] answer = {start, end};
                    //System.out.println(start + " " + end);
                    return answer;
                }
                if (sum < target)
                    start++;
                if (sum > target)
                    end--;
            }
            return null;
        }
    }
    public static class UnitTest{
        @Test
        public void testTargetSum() {
            int[] input = {1, 3, 4, 5, 6, 8, 0, 13, 2, 15};
            int target = 15;
            int[] result = {0, 9};
            Solution solution = new TargetSum().new Solution();
            int[] answer = solution.targetSum(input, target);
            //System.out.println(new String(answer));
            assertTrue(Arrays.equals(result,answer));
        }
    }
}

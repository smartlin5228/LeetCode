package main.java.SearchAndSort;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by demon on 2016/11/16.
 */
public class SearchingSortedArray {
    public class Solution {
        public int findValue(int[] input, int target) {
            return findValue(input, target, 0, input.length - 1);
        }
        private int findValue(int[] input, int target, int min, int max) {
            int mid = (min + max) / 2;
            if (input[mid] == target)
                return mid;
            if (min >= max) {
                return -1;
            }
            if (target < mid)
                return findValue(input, target, min, mid);
            return findValue(input, target, mid + 1, max);
        }
    }

    public static class UnitTest {
        @Test
        public void testSearchingSortedArray() {
            int[] input = {1,2,3,4,5,6,7,8,9,10,13,15,17,19};
            int target = 19;
            Solution solution = new SearchingSortedArray().new Solution();
            assertTrue(13 == solution.findValue(input, target));
        }
    }
}

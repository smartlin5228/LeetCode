package main.java.bit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 Given an array of integers where each number appears exactly twice, except for one integer that
 appears exactly once, find the lone integer.

 */
public class FindLoneInteger {
    public class Solution {
        public int findTheLoner(int[] input) {
            int value = 0;
            for (int i = 0; i < input.length; i++) {
                value = value ^ input[i];
            }
            return value;
        }
    }
    public static class UnitTest {
        @Test
        public void testFindLoner() {
            int[] input = {1, 1, 2, 2, 3, 3, 32, 32, 44};
            int output = 44;
            Solution solution = new FindLoneInteger().new Solution();
            assertTrue(output == solution.findTheLoner(input));
        }
    }
}

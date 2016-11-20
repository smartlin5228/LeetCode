package main.java.bit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by demon on 2016/11/15.
 */
public class PowerOfTwo {
    public class Solution {
        public boolean isPowerOfTwo(int x) {
            //If we subtract one from a power of two, it is equivalent to fliping every to the right of the 1,
            return (x & (x - 1)) == 0;
        }
    }
    public static class UnitTest{
        @Test
        public void testPowerOfTwo() {
            Solution solution = new PowerOfTwo().new Solution();
            assertTrue(solution.isPowerOfTwo(8));
            assertTrue(!solution.isPowerOfTwo(9));
        }
    }
}

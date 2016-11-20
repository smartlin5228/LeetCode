package main.java.bit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by demon on 2016/11/15.
 */
public class ComputingTwoX {
    //write a function compute 2x without using the multiplication operator
    //or looping structures
    public class Solution {
        public int twoToThe(int x) {
            return 1 << x;
        }
    }

    public static class UnitTest {
        @Test
        public void testComputingTwox() {
            Solution solution = new ComputingTwoX().new Solution();
            assertTrue(8 == solution.twoToThe(3));
        }
    }
}

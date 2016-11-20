package main.java.bit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by demon on 2016/11/15.
 */
public class SameSignCheck {
    public class Solution {
        public boolean isSameSign(int x, int y) {
            return ((x ^ y) < 0);
        }
    }
    public static class UnitTest {
        @Test
        public void testSameSignCheck() {
            Solution solution = new SameSignCheck().new Solution();
            assertTrue(solution.isSameSign(-1, -1));
            //assertTrue(solution.isSameSign(1, 1));
            //assertTrue(!solution.isSameSign(1, -1));
        }
    }
}

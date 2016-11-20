package main.java.string;

import main.java.array.TwoSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by demon on 2016/11/15.
 */
public class LongestCommonString {
    public class Solution {
        public int longestCommonString(String one, String two) {
            int n = one.length();
            int m = two.length();
            if (n == 0 || m == 0) {
                return 0;
            }
            int maxLength = 0;
            int [][] memorized = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (one.charAt(i) == two.charAt(j)) {
                        if (i == 0 || j == 0) {
                            memorized[i][j] = 1;
                        } else {
                            memorized[i][j] = memorized[i - 1][j - 1] + 1;
                        }
                        if (memorized[i][j] > maxLength) {
                            maxLength = memorized[i][j];
                        }
                    }
                }
            }
            return maxLength;
        }
    }
    public static class UnitTest {
        @Test
        public void testLongestCommonString() {
            String one  = "I love you TenTen";
            String two = "TenTen";
            Solution solution = new LongestCommonString().new Solution();
            assertEquals(6, solution.longestCommonString(one, two));
        }
    }
}

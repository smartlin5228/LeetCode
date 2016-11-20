package main.java.string;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by demon on 2016/11/15.
 */
public class StringToInteger {
    public class Solution {
        public  int stringToInteger(String input) {
            int result = 0;
            int i = 0;
            boolean isNegative = false;
            if (input.charAt(i) == '-') {
                isNegative = true;
                i++;
            }
            for (; i < input.length(); i++) {
                result *= 10;
                result += ((int) input.charAt(i) - '0');
            }
            if (isNegative) {
                result *= -1;
            }
            return result;
        }
    }
    public static class Test {
        @org.junit.Test
        public void testStringtoInteger() {
            Solution solution = new StringToInteger().new Solution();
            String input = "486";
            assertTrue(486 == solution.stringToInteger(input));
        }
    }
}

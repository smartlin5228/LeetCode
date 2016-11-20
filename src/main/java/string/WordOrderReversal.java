package main.java.string;

import main.java.array.TwoSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by demon on 2016/11/14.
 */
public class WordOrderReversal {
    public class Solution {
        public char[] reverseWordOrder(char[] words) {
            reverseCharacters(words, 0, words.length);
            int lastspace = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i] == ' ') {
                    reverseCharacters(words, lastspace, i);
                    lastspace = i + 1;
                }
            }
            reverseCharacters(words, lastspace, words.length);
            return words;
        }
    }

    private static void reverseCharacters(char[] words, int start, int end) {
        for (int i = 0; i < (start + end) / 2; i++) {
            char temp = words[start + i];
            words[start + i] = words[end - i - 1];
            words[end - i - 1] = temp;
        }
    }
    public static class UnitTest{

        @Test
        public void testReverseCharacters() {
            Solution  solution = new WordOrderReversal().new Solution();
            char[] array = { 'a', 't', 's', 't',' ', 'a'};
            char[] result = { 'a', ' ', 'a', 't','s', 't'};
            assertEquals(new String(solution.reverseWordOrder(array)),new String(result));
        }

    }
}

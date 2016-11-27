package main.java.SearchAndSort;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class KSmallestElements {
    public class Solution {
        public void swap(int input[], int a, int b) {
            int temp = input[a];
            input[a] = input[b];
            input[b] = temp;
        }
        public int partition(int input[], int front, int end) {
            int pivot = input[front];
            while (front < end) {
                while (input[front] < pivot)
                    front++;
                while (input[end] > pivot)
                    end--;
                swap(input, front, end);
            }
            return front;
        }
        private int[] findKSmallest(int input[], int front, int end, int k) {
            if (front >= end) return null;
            int pivot = partition(input, front, end);
            if (pivot == k)
                return Arrays.copyOfRange(input, 0, pivot);
            else {
                if(pivot > k)
                    return findKSmallest(input, front, pivot, k);
                return findKSmallest(input, pivot + 1, end, k);
            }
        }
        public int[] findKSmallest(int input[], int k) {
            return findKSmallest(input, 0, input.length - 1, k);
        }
    }
    public static class UnitTest {
        @Test
        public void testKSmallest() {
            Solution solution = new KSmallestElements().new Solution();
            int[] input = {0, 1, 2, 3, 4, 5, 6, 7};
            int x = 3;
            int[] output = {0, 1, 2};
            assertTrue(Arrays.equals(output, solution.findKSmallest(input,x)));
        }
    }
}

package main.java.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by demon on 2016/11/5.
 */
public class MedianOfTwoSortedArrays {
    public class Solution {
        private int findKth(int A[], int m, int B[], int n, int k) {
            if (m == 0) {
                return B[k - 1];
            }
            if (n == 0) {
                return A[k - 1];
            }
            if (m + n == k) {
                //since both of them are sorted
                return Math.max(A[m - 1], B[n - 1]);
            }
            if (m > n) {
                return findKth(B, n, A, m, k);
            }
            int x = Math.min(m, k / 2 + 1);
            int y = k + 1 - x;
            if (A[x - 1] < B[y -1]) {
                return findKth(A, m, B, y - 1, k);
            } else if (A[x - 1] > B[y - 1]) {
                return findKth(A, x - 1, B, n, k);
            } else {
                return A[x - 1];
            }
        }
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                int  k = nums1.length + nums2.length;
            if (k % 2 == 1) {
                return findKth(nums1, nums1.length,nums2, nums2.length, k / 2 + 1);
            } else {
                return (findKth(nums1, nums1.length, nums2, nums2.length, k / 2 + 1) + findKth(nums1, nums1.length, nums2, nums2.length, k / 2)) / 2.0;
            }
        }

    }
    public static class UnitTest {

        @Test
        public void testFindMedianSortedArrays() {
            Solution s = new MedianOfTwoSortedArrays().new Solution();
            assertTrue(2.5 == s.findMedianSortedArrays(new int[]{3, 4}, new int[]{1, 2}));
        }
    }
}

package main.java.SearchAndSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/*
 * O(nlogn).worst time O(n2)
 * space O(1)
 */
public class QuickSort {
    public static void swap(int input[], int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }
    public static int partition(int input[], int front, int end) {
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
    public static void quickSort(int input[], int front, int end) {
        if (front >= end) return;
        int pivot = partition(input, front, end);
        quickSort(input, front, pivot);
        quickSort(input, pivot + 1, end);
    }
    public static class UnitTest {
        @Test
        public void testQuickSort() {
            int[] input = {4, 0, 1, 2, 3};
            int[] output = {0, 1, 2, 3, 4};
            quickSort(input, 0, 4);
            assertTrue(Arrays.equals(input, output));
        }
    }
}

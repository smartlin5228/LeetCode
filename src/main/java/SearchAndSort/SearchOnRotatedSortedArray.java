package main.java.SearchAndSort;

/**
 * Created by demon on 2016/11/16.
 */
public class SearchOnRotatedSortedArray {
    public class Solution {
        public int rotatedSearch(int[] values, int min, int max, int x) {
            if (values[min] == x)
                return min;
            else if (values[max] == x)
                return max;
            else if (max - min == 1)
                return -1;
            int mid = (min + max) / 2;

            if (values[min] <= values[mid]) {
                if (x <= values[mid] && x>= values[min])
                    return rotatedSearch(values, min, mid, x);
                else
                    return rotatedSearch(values, mid, max, x);
            } else {
                if (x >= values[mid] && x <= values[max])
                    return rotatedSearch(values, mid, max, x);
                else
                    return rotatedSearch(values, min, mid, x);
            }
        }
    }
}

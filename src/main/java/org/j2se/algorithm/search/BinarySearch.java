package org.j2se.algorithm.search;

public class BinarySearch {

    public static int search(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int item = array[mid];

            if (item == target) {
                return mid;
            } else if (item < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

}

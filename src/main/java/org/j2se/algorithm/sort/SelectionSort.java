package org.j2se.algorithm.sort;

import org.j2se.algorithm.util.SwapUtils;

public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0, len = array.length; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                SwapUtils.swap(array, i, min);
            }
        }
    }

}

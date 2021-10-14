package org.j2se.algorithm.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void testSort() {
        int[] array = {9, 7, 5, 3, 1};
        SelectionSort.sort(array);
        Assertions.assertArrayEquals(array, new int[]{1, 3, 5, 7, 9});
    }

}

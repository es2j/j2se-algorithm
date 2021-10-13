package org.j2se.algorithm.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testSearch() {
        int[] nulls;
        int[] empty = {};
        int[] array = {1, 3, 5, 7, 9};
        Assertions.assertEquals(3, BinarySearch.search(array, 7));
        Assertions.assertEquals(-1, BinarySearch.search(empty, 7));
        Assertions.assertEquals(-1, BinarySearch.search(array, 8));
    }

}

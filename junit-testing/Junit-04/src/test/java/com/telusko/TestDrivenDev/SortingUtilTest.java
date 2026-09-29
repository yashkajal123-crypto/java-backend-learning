package com.telusko.TestDrivenDev;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.telusko.TestDrivenDev.SortingUtil;
import org.junit.jupiter.api.Test;

class SortingUtilTest {

    private final SortingUtil sorter = new SortingUtil();

    @Test
    void testBubbleSortOnUnsortedArray() {
        int[] input = {5, 2, 8, 1, 9};
        int[] expected = {1, 2, 5, 8, 9};

        int[] actual = sorter.bubbleSort(input);

        assertArrayEquals(expected, actual, "Array should be sorted in ascending order");
    }

    @Test
    void testBubbleSortOnAlreadySortedArray() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};

        assertArrayEquals(expected, sorter.bubbleSort(input),
                "Already sorted array should remain unchanged");
    }

    @Test
    void testBubbleSortDoesNotMutateOriginal() {
        int[] input = {3, 1, 2};
        int[] originalSnapshot = {3, 1, 2};

        sorter.bubbleSort(input);

        assertArrayEquals(originalSnapshot, input,
                "Original input array must remain untouched (defensive copy check)");
    }

    @Test
    void testSortNamesAlphabetically() {
        String[] input = {"Yash", "Aman", "Zoya", "Kabir"};
        String[] expected = {"Aman", "Kabir", "Yash", "Zoya"};

        assertArrayEquals(expected, sorter.sortNames(input),
                "Names should be sorted alphabetically");
    }
}

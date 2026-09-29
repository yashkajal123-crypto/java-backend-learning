package com.telusko.TestDrivenDev;

import java.util.Arrays;

public class SortingUtil {

    // Simple bubble sort implementation
    public int[] bubbleSort(int[] input) {
        int[] arr = Arrays.copyOf(input, input.length); // avoid mutating original
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Returns names sorted alphabetically
    public String[] sortNames(String[] names) {
        String[] result = Arrays.copyOf(names, names.length);
        Arrays.sort(result);
        return result;
    }
}

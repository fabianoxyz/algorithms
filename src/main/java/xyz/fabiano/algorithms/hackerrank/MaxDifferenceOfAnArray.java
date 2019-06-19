package xyz.fabiano.algorithms.hackerrank;

import java.util.List;

public class MaxDifferenceOfAnArray {

    public static int maxDifference(List<Integer> arr) {
        int difference = -1;
        int size = arr.size();
        int maxValue = arr.get(size - 1);

        for (int i = size - 2; i >= 0; i--) {
            if (arr.get(i) > maxValue) {
                maxValue = arr.get(i);
            } else {
                difference = Integer.max(difference, maxValue - arr.get(i));
            }
        }

        return difference;
    }
}

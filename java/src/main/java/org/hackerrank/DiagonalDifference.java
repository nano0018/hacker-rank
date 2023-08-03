package org.hackerrank;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftSum = 0;
        int rightSum = 0;
        int row = 0;
        for (int i = 0; i < arr.size(); i++) {
            int leftValue = arr.get(row).get(i);
            int rightValue = arr.get(row).get((arr.size() - 1) - i);
            leftSum += leftValue;
            rightSum += rightValue;
            row++;
        }
        return Math.abs(leftSum - rightSum);
    }
}

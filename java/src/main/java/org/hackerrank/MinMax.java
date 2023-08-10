package org.hackerrank;

import java.util.List;

public class MinMax {

    public static void minMaxSum(List<Integer> arr) {
        int arraySum = 0;
        for (int number:
             arr) {
            arraySum += number;
        }
        int minSum = 0;
        int maxSum = 0;
        for (int number : arr) {
            int currentSum = arraySum - number;
            if (minSum == 0) {
                minSum = currentSum;
            }

            if (currentSum < minSum) {
                minSum = currentSum;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.print(String.valueOf(minSum) + " "  + String.valueOf(maxSum));
    }
}

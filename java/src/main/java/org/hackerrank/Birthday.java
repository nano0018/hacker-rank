package org.hackerrank;

import java.util.List;

public class Birthday {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            boolean isCounting = true;
            int sum = 0;
            int innerCount = 0;
            while (isCounting) {
                int currentNumber = s.get(i + innerCount);
                sum += currentNumber;
                if (innerCount == m -1) {
                    isCounting = false;
                } else {
                    innerCount++;
                }
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }
}

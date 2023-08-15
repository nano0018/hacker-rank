package org.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        Integer max = null;
        Integer min = null;
        int maxCount = 0;
        int minCount = 0;
        List<Integer> results = new ArrayList<>();
        for (int score :
                scores) {
            if (min == null) {
                min = score;
                max = score;
            }

            if (score > max) {
                max = score;
                maxCount++;
            }

            if (score < min) {
                min = score;
                minCount++;
            }
            }
        results.add(maxCount);
        results.add(minCount);
        return results;
    }
}

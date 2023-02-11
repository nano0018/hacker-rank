package org.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class HourglassSum {
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int rowSize = arr.get(1).size();
        int colSize = arr.size();

        for (int colIndex = 0; colIndex < colSize - 2; colIndex++) {
            List<Integer> hourglassHead = new ArrayList<>();
            List<Integer> hourglassTail = new ArrayList<>();
            List<Integer> hourglassMiddle = new ArrayList<>();
            if (colIndex < (colSize-2)) {
                for (int i = 0; i < rowSize; i++) {
                    int pos1 = i;
                    int pos2 = i + 1;
                    int pos3 = i + 2;
                    if (pos3 < (rowSize)) {
                        // Head
                        hourglassHead.add(arr.get(colIndex).get(pos1));
                        hourglassHead.add(arr.get(colIndex).get(pos2));
                        hourglassHead.add(arr.get(colIndex).get(pos3));

                        // Tail
                        hourglassTail.add(arr.get(colIndex + 2).get(pos1));
                        hourglassTail.add(arr.get(colIndex + 2).get(pos2));
                        hourglassTail.add(arr.get(colIndex + 2).get(pos3));
                    }
                }
            }
            for (int j = 1; j < rowSize - 1; j++) {
                hourglassMiddle.add(arr.get(colIndex+1).get(j));
            }

            System.out.println(hourglassHead);
            System.out.println(hourglassMiddle);
            System.out.println(hourglassTail);
            System.out.println("---");


        }






        return 12;
    }

    public static List<Integer> StringArrToIntArr(String[] s) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            result.add(Integer.valueOf(s[i]));
        }
        return result;
    }
}

package org.hackerrank;

import java.util.List;

public class CountApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0;
        int orangeCount = 0;
        for (int apple :
                apples) {
            int applePosition = a + apple;
            if (applePosition >= s && applePosition <= t) {
                appleCount++;
            }
        }
        for (int orange :
                oranges) {
            int orangePosition = b + orange;
            if (orangePosition >= s && orangePosition <= t) {
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}

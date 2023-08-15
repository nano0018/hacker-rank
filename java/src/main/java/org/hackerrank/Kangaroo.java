package org.hackerrank;

public class Kangaroo {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        double division = (double) (x1 - x2) / (v2 - v1);
        if (division < 0 || division % 1 != 0) {
            return "NO";
        }
        return "YES";
    }
}

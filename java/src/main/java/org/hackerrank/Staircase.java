package org.hackerrank;

public class Staircase {
    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String element = "#";
            int emptySpaces = n - i;
            String currentLine = " ".repeat(emptySpaces) + element.repeat(i);
            System.out.println(currentLine);
        }
    }
}

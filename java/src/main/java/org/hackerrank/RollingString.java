package org.hackerrank;

import java.util.List;

public class RollingString {
    public static String rollingString(String s, List<String> operations) {
        char[] arrayChar = s.toCharArray();
        for (int index = 0; index < operations.size(); index++) {
            String[] operation = operations.get(index).split(" ");
            int i = Integer.parseInt(operation[0]);
            int j = Integer.parseInt(operation[1]);
            char ch = operation[2].charAt(0);
//            System.out.println("{\n" +
//                    "i: " + i +
//                    "\nj: " + j +
//                    "\nch: " + ch +
//                    "\n}");
            for (int k = i; k <= j; k++) {
                char currentChar = arrayChar[k];
                if (ch == "R".charAt(0)) {
                    currentChar += 1;
                    if (currentChar > 122) {
                        currentChar = 97;
                    }
                } else {
                    currentChar -= 1;
                    if (currentChar < 97) {
                        currentChar = 122;
                    }
                }
                arrayChar[k] = currentChar;
            }
        }
        return new String(arrayChar);
    }
}

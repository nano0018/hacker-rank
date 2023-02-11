package org.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        ArrayList<Integer> reversedArray = new ArrayList<>();
        for (int i = a.size()-1; i >= 0; i--) {
            reversedArray.add(a.get(i));
        }
        return reversedArray;
    }
}

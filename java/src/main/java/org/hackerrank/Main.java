package org.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(4);
        testList.add(3);
        testList.add(2);
        System.out.println(testList);
        System.out.println(ReverseArray.reverseArray(testList));
    }
}
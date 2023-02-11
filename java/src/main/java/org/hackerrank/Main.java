package org.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        reverseArray
//        List<Integer> testList = new ArrayList<>();
//        testList.add(1);
//        testList.add(4);
//        testList.add(3);
//        testList.add(2);
//        System.out.println(testList);
//        System.out.println(ReverseArray.reverseArray(testList));

        List<List<Integer>> testList = new ArrayList<>();

        String[] dataString1 = "1 1 1 0 0 0".split(" ");
        String[] dataString2 = "0 1 0 0 0 0".split(" ");
        String[] dataString3 = "1 1 1 0 0 0".split(" ");
        String[] dataString4 = "0 0 2 4 4 0".split(" ");
        String[] dataString5 = "0 0 0 2 0 0".split(" ");
        String[] dataString6 = "0 0 1 2 4 0".split(" ");

        List<Integer> data1 = HourglassSum.StringArrToIntArr(dataString1);
        List<Integer> data2 = HourglassSum.StringArrToIntArr(dataString2);
        List<Integer> data3 = HourglassSum.StringArrToIntArr(dataString3);
        List<Integer> data4 = HourglassSum.StringArrToIntArr(dataString4);
        List<Integer> data5 = HourglassSum.StringArrToIntArr(dataString5);
        List<Integer> data6 = HourglassSum.StringArrToIntArr(dataString6);

        testList.add(data1);
        testList.add(data2);
        testList.add(data3);
        testList.add(data4);
        testList.add(data5);
        testList.add(data6);

        HourglassSum.hourglassSum(testList);
        System.out.println();

    }
}
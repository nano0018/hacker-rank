package org.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
////        reverseArray
//        List<Integer> testList = new ArrayList<>();
//        testList.add(1);
//        testList.add(4);
//        testList.add(3);
//        testList.add(2);
//        System.out.println(testList);
//        System.out.println(ReverseArray.reverseArray(testList));

////        hourglassSum
//        List<List<Integer>> testList = new ArrayList<>();
//
//        String[] dataString1 = "0 0 0 0 -7 -6".split(" ");
//        String[] dataString2 = "-1 0 -6 -8 -3 -1".split(" ");
//        String[] dataString3 = "0 0 0 -8 -8 -6".split(" ");
//        String[] dataString4 = "-3 -1 -2 -5 -7 -4".split(" ");
//        String[] dataString5 = "-3 -5 -3 -6 -6 -6".split(" ");
//        String[] dataString6 = "-3 -6 0 -8 -6 -7".split(" ");
//
//        List<Integer> data1 = HourglassSum.stringArrToIntArr(dataString1);
//        List<Integer> data2 = HourglassSum.stringArrToIntArr(dataString2);
//        List<Integer> data3 = HourglassSum.stringArrToIntArr(dataString3);
//        List<Integer> data4 = HourglassSum.stringArrToIntArr(dataString4);
//        List<Integer> data5 = HourglassSum.stringArrToIntArr(dataString5);
//        List<Integer> data6 = HourglassSum.stringArrToIntArr(dataString6);
//        testList.add(data1);
//        testList.add(data2);
//        testList.add(data3);
//        testList.add(data4);
//        testList.add(data5);
//        testList.add(data6);
//        System.out.println(HourglassSum.hourglassSum(testList));
////        Rolling String
//        List<String> operations = new ArrayList<>();
//        operations.add("0 1 L");
//        operations.add("1 2 R");
//        operations.add("0 2 R");
//
//        System.out.println(RollingString.rollingString("abc", operations));
//        Staircase.staircase(4);
//        List<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        MinMax.minMaxSum(arr);
//        String time = "07:05:45PM";
//        String delimiters = "[a-zA-Z]+";
//        String[] numbers = time.split(delimiters)[0].split(":");
//        String period = time.split(":")[2].split("[0-9]+")[1];
//        System.out.println(period);
        List<Integer> apples = new ArrayList<>(Arrays.asList(new Integer[]{-2, 2, 1}));
        List<Integer> oranges = new ArrayList<>(Arrays.asList(new Integer[]{5, -6}));
        CountApplesAndOranges.countApplesAndOranges(7, 11, 5, 15, apples, oranges);
    }
}
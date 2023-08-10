package org.hackerrank;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maxCandle = 0;
        int countMaxCandle = 0;
        for (int candle:
             candles) {
            if (candle > maxCandle){
                maxCandle = candle;
            }
        }
        for (int candle:
             candles) {
            if (candle == maxCandle) {
                countMaxCandle++;
            }
        }
        return countMaxCandle;
    }
}

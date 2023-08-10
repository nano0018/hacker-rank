package org.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayCakeCandlesTest {
    @Test
    void should_return_2_tallest_candles() {
        List<Integer> candles = new ArrayList<>(4);
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);
        int candleCount = BirthdayCakeCandles.birthdayCakeCandles(candles);
        assertEquals(candleCount, 2);
    }
    @Test
    void should_return_3_tallest_candles() {
        List<Integer> candles = new ArrayList<>(4);
        candles.add(3);
        candles.add(2);
        candles.add(3);
        candles.add(3);
        int candleCount = BirthdayCakeCandles.birthdayCakeCandles(candles);
        assertEquals(candleCount, 3);
    }
}
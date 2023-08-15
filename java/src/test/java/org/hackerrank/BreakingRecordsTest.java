package org.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BreakingRecordsTest {
    @Test
    void should_return_2_4() {
        Integer[] integers = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        Integer[] integers2 = {2, 4};
        List<Integer> expectedValues = new ArrayList<>(Arrays.asList(integers2));
        List<Integer> values = new ArrayList<>(Arrays.asList(integers));
        assertEquals(BreakingRecords.breakingRecords(values), expectedValues);
    }
    @Test
    void should_return_3_0_with_init_score_zero() {
        Integer[] integers = {0, 9, 3, 10, 2, 20};
        Integer[] integers2 = {3, 0};
        List<Integer> expectedValues = new ArrayList<>(Arrays.asList(integers2));
        List<Integer> values = new ArrayList<>(Arrays.asList(integers));
        assertEquals(BreakingRecords.breakingRecords(values), expectedValues);
    }
    @Test
    void should_return_4_0() {
        Integer[] integers = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        Integer[] integers2 = {4, 0};
        List<Integer> expectedValues = new ArrayList<>(Arrays.asList(integers2));
        List<Integer> values = new ArrayList<>(Arrays.asList(integers));
        assertEquals(BreakingRecords.breakingRecords(values), expectedValues);
    }
}
package org.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayTest {
    @Test
    void should_return_2() {
        Integer[] integers = {1, 2, 1, 3, 2};
        int expectedValues = 2;
        List<Integer> values = new ArrayList<>(Arrays.asList(integers));
        assertEquals(expectedValues,Birthday.birthday(values, 3, 2));
    }

    @Test
    void should_return_0() {
        Integer[] integers = {1, 1, 1, 1, 1, 1};
        int expectedValues = 0;
        List<Integer> values = new ArrayList<>(Arrays.asList(integers));
        assertEquals(expectedValues,Birthday.birthday(values, 3, 2));
    }

    @Test
    void should_return_1() {
        Integer[] integers = {4};
        int expectedValues = 1;
        List<Integer> values = new ArrayList<>(Arrays.asList(integers));
        assertEquals(expectedValues,Birthday.birthday(values, 4, 1));
    }

    @Test
    void should_return_3() {
        Integer[] integers = {2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1,};
        int expectedValues = 3;
        List<Integer> values = new ArrayList<>(Arrays.asList(integers));
        assertEquals(expectedValues,Birthday.birthday(values, 18, 7));
    }
}
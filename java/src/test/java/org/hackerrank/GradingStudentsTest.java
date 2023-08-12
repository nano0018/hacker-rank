package org.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradingStudentsTest {
    @Test
    void should_return_an_array_with_rounded_grades_over_38() {
        Integer[] integers = {73, 67, 38, 33};
        Integer[] integers2 = {75, 67, 40, 33};
        List<Integer> expectedGrades = new ArrayList<>(Arrays.asList(integers2));
        List<Integer> grades = new ArrayList<>(Arrays.asList(integers));
        List<Integer> roundedGrades = GradingStudents.gradingStudents(grades);
        assertEquals(roundedGrades, expectedGrades);
    }
}
package org.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalDifferenceTest {
    @Test
    void check_diff_square_matrix_3d() {
        List<List<Integer>> array1 = new ArrayList<>();
        List<Integer> row11 = new ArrayList<>();
        row11.add(1);
        row11.add(2);
        row11.add(3);
        List<Integer> row12 = new ArrayList<>();
        row12.add(4);
        row12.add(5);
        row12.add(6);
        List<Integer> row13 = new ArrayList<>();
        row13.add(9);
        row13.add(8);
        row13.add(9);
        array1.add(row11);
        array1.add(row12);
        array1.add(row13);

        List<List<Integer>> array2 = new ArrayList<>();
        List<Integer> row21 = new ArrayList<>();
        row21.add(11);
        row21.add(2);
        row21.add(4);
        List<Integer> row22 = new ArrayList<>();
        row22.add(4);
        row22.add(5);
        row22.add(6);
        List<Integer> row23 = new ArrayList<>();
        row23.add(10);
        row23.add(8);
        row23.add(-12);
        array2.add(row21);
        array2.add(row22);
        array2.add(row23);

        assertEquals(DiagonalDifference.diagonalDifference(array1), 2);
        assertEquals(DiagonalDifference.diagonalDifference(array2), 15);
    }
}
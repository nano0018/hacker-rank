package org.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades =  new ArrayList<>();
        for (int grade:
             grades) {
            int roundedGrade = (int)Math.ceil(((double) grade / 5)) * 5;
            if (grade >= 38 && roundedGrade - grade < 3) {
                roundedGrades.add(roundedGrade);
            } else {
                roundedGrades.add(grade);
            }
        }
        return roundedGrades;
    }
}

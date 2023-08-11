package org.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {
    @Test
    void convert_time_between_0_11_pm() {
        String time = "07:05:45PM";
        String formattedTime = TimeConversion.timeConversion(time);
        assertEquals(formattedTime, "19:05:45");
    }
    @Test
    void convert_time_12_am() {
        String time = "12:01:00AM";
        String formattedTime = TimeConversion.timeConversion(time);
        assertEquals(formattedTime, "00:01:00");
    }
    @Test
    void convert_time_12_pm() {
        String time = "12:01:00PM";
        String formattedTime = TimeConversion.timeConversion(time);
        assertEquals(formattedTime, "12:01:00");
    }
}
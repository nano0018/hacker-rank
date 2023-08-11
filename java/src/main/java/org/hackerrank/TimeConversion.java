package org.hackerrank;

import java.util.Objects;

public class TimeConversion {
    public static String timeConversion(String time) {
        String delimiter = "[a-zA-Z]+";
        String numberDelimiter = "[0-9]+";
        String[] numbers = time.split(delimiter)[0].split(":");
        String period = time.split(":")[2].split(numberDelimiter)[1];
        int hour = Integer.parseInt(numbers[0]);
        String stringHour = "";

        if (Objects.equals(period, "PM") && hour < 12) {
            hour += 12;
        }

        if (Objects.equals(period, "AM") && hour == 12) {
            hour = 0;
        }

        stringHour = String.valueOf(hour);

        if (hour < 10) {
            stringHour = "0" + stringHour;
        }

        return stringHour +":"+ numbers[1] +":"+ numbers[2];
    }
}

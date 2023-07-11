package me.veryyoung.oj.hackerrank;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class TimeConversion {
    public String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        if (s.endsWith("PM")) {
            if (hour < 12) {
                hour += 12;
            }
        } else if (s.endsWith("AM")) {
            if (hour >= 12) {
                hour -= 12;
            }
        }
        return (hour >= 10 ? hour + "" : "0" + hour) + s.substring(2, 8);
    }
}

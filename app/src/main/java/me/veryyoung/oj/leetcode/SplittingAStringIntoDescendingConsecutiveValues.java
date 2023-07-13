package me.veryyoung.oj.leetcode;

/**
 * 1849. Splitting a String Into Descending Consecutive Values
 * https://leetcode.com/problems/splitting-a-string-into-descending-consecutive-values/
 */
public class SplittingAStringIntoDescendingConsecutiveValues {

    public boolean splitString(String s) {
        while (s.startsWith("0")) {
            s = s.replaceFirst("0", "");
        }
        if (s.length() <= 1) {
            return false;
        }
        for (int i = 1; i <= s.length() / 2 + 1; i++) {
            if (i == s.length()) {
                return false;
            }
            boolean isConsecutive = true;
            int start = i;
            long lastNumber = Long.parseLong(s.substring(0, i));
            for (int end = start + 1; end <= s.length(); end++) {
                long currentNumber = Long.parseLong(s.substring(start, end));
                if (lastNumber < currentNumber) {
                    isConsecutive = false;
                    break;
                }
                if (lastNumber - currentNumber == 1) {
                    lastNumber = currentNumber;
                    start = end;
                } else if (end == s.length() && lastNumber != 0) {
                    isConsecutive = false;
                    break;
                }
            }
            if (isConsecutive) {
                return true;
            }
        }
        return false;
    }

}

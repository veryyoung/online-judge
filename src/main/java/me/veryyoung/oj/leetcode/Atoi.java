package me.veryyoung.oj.leetcode;

/**
 * Created by veryyoung on 14-6-8.
 */
public class Atoi {
    public int atoi(String str) {
        str = str.trim();
        if (str.equals(""))
            return 0;

        boolean isNeg = false;
        if (str.charAt(0) == '-') {
            isNeg = true;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }

        int length = str.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            char tempChar = str.charAt(i);
            if (tempChar > 57 || tempChar < 48) {
                if (isNeg) return (0 - result);
                return result;
            }
            if (isNeg && result > -((Integer.MIN_VALUE + tempChar - 48) / 10))
                return Integer.MIN_VALUE;
            else if (!isNeg && result > (Integer.MAX_VALUE - tempChar + 48) / 10)
                return Integer.MAX_VALUE;
            result = result * 10 + tempChar - 48;

        }
        if (isNeg) return (0 - result);
        return result;
    }
}

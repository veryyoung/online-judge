package me.veryyoung.oj.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        if (x < 0) return (0 - result);
        return result;
    }
}

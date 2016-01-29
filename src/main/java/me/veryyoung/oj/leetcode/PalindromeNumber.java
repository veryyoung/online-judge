package me.veryyoung.oj.leetcode;

/**
 * Created by veryyoung on 14-6-13.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;

    }
}

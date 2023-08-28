package me.veryyoung.oj.leetcode;

/**
 * 125. Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {

    /**
     * Use begin and end two index to traverse the char array of the string at the same pace,
     * if is not letter or digit, skip;
     * it not the same, is not a valid palindrome
     */
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int begin = 0;
        int end = chars.length - 1;
        while (begin < end) {
            if (!Character.isLetterOrDigit(chars[begin])) {
                begin++;
                continue;
            }
            if (!Character.isLetterOrDigit(chars[end])) {
                end--;
                continue;
            }
            if (Character.toLowerCase(chars[begin]) != Character.toLowerCase(chars[end])) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

}

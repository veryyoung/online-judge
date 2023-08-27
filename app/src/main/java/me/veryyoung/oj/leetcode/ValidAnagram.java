package me.veryyoung.oj.leetcode;

import java.util.Arrays;

/**
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {


    /**
     * If s.length != t.length, return false
     * Sort the two strings, and check if s equals t.
     * Time complexity is mlg(m) + nlg(n) + m+n
     * Space complexity is m+n
     * m is length of s, n is length of t
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);

        return new String(sChars).equals(new String(tChars));
    }

}

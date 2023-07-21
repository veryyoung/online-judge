package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTest {

    @Test
    public void testLongestPalindrome() {
        LongestPalindromicSubstring instance = new LongestPalindromicSubstring();
        assertEquals("aba", instance.longestPalindrome("babad"));
        assertEquals("bb", instance.longestPalindrome("cbbd"));
    }

}

package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidPalindromeTest {

    @Test
    public void testIsPalindrome() {
        ValidPalindrome instance = new ValidPalindrome();
        assertEquals(true, instance.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, instance.isPalindrome("race a car"));
        assertEquals(true, instance.isPalindrome(" "));
        assertEquals(false, instance.isPalindrome("0P"));
    }

}

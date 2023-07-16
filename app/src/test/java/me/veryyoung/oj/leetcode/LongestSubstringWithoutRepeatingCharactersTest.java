package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters instance = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, instance.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, instance.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, instance.lengthOfLongestSubstring("pwwkew"));
    }

}

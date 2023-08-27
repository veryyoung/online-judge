package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidAnagramTest {

    @Test
    public void testIsAnagram() {
        ValidAnagram instance = new ValidAnagram();
        assertEquals(true, instance.isAnagram("anagram", "nagaram"));
        assertEquals(false, instance.isAnagram("rat", "car"));
    }

}

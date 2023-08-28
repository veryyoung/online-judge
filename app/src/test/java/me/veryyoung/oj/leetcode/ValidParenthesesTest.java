package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {

    @Test
    public void testIsValid() {
        ValidParentheses instance = new ValidParentheses();
        assertEquals(true, instance.isValid("()"));
        assertEquals(true, instance.isValid("()[]{}"));
        assertEquals(false, instance.isValid("(]"));
    }

}

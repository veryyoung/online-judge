package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GenerateParenthesesTest {

    @Test
    public void testGenerateParentheses() {
        GenerateParentheses instance = new GenerateParentheses();
        assertArrayEquals(new String[]{"((()))", "(()())", "(())()", "()(())", "()()()"}, instance.generateParenthesis(3).toArray(new String[0]));
        assertArrayEquals(new String[]{"()"}, instance.generateParenthesis(1).toArray(new String[0]));
    }

}

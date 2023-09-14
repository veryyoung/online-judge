package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreOfParenthesesTest {

    @Test
    public void testScoreOfParentheses() {
        ScoreOfParentheses instance = new ScoreOfParentheses();
        assertEquals(1, instance.scoreOfParentheses("()"));
        assertEquals(2, instance.scoreOfParentheses("(())"));
        assertEquals(2, instance.scoreOfParentheses("()()"));
        assertEquals(6, instance.scoreOfParentheses("(()(()))"));
    }

}

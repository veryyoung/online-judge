package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaluateReversePolishNotationTest {

    @Test
    public void testEvalRPN() {
        EvaluateReversePolishNotation instance = new EvaluateReversePolishNotation();
        assertEquals(9, instance.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        assertEquals(6, instance.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        assertEquals(22, instance.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17",
                "+", "5", "+"}));
    }

}

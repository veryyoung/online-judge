package me.veryyoung.oj.leetcode;

import java.util.Stack;

/**
 * 856. Score of
 * https://leetcode.com/problems/score-of-parentheses/
 */
public class ScoreOfParentheses {

    /**
     * Use a stack to store the previous score
     * Traversal the string, if char == '(', push score to the stack, and reset the score
     * if char == '(', calculate the score between it and the first '('
     * <p>
     * pop the innerScore, the external score is equal to the popped internal score plus twice the current score
     * (or 1, if the current score is 0)
     * so the total score will be   innerScore + max(2*score, 1)
     */
    public int scoreOfParentheses(String s) {
        int score = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(score);
                score = 0;
            } else {
                score = stack.pop() + Math.max(2 * score, 1);
            }
        }
        return score;
    }

}

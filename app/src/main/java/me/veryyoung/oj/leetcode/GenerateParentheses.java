package me.veryyoung.oj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 * https://leetcode.com/problems/generate-parentheses/
 */
public class GenerateParentheses {

    /**
     * Use recursion to solve this problem.
     * Use two variables leftRemaining and rightRemaining
     * If leftRemaining  == rightRemaining and leftRemaining  is zero, the path is right
     * If leftRemaining is bigger than 0, the left parentheses can be added
     * If leftRemaining is smaller than rightRemaining, the right parentheses can be added
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(result, "", n, n);
        return result;
    }

    private void generateParenthesis(List<String> result, String path, int leftRemaining, int rightRemaining) {
        if (leftRemaining == 0 && leftRemaining == rightRemaining) {
            result.add(path);
            return;
        }
        if (leftRemaining > 0) {
            generateParenthesis(result, path + "(", leftRemaining - 1, rightRemaining);
        }
        if (leftRemaining < rightRemaining) {
            generateParenthesis(result, path + ")", leftRemaining, rightRemaining - 1);
        }
    }
    
}

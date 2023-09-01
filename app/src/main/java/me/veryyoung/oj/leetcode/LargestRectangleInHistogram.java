package me.veryyoung.oj.leetcode;

import java.util.Stack;

/**
 * 84. Largest Rectangle in
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 */
public class LargestRectangleInHistogram {

    /**
     * Use a monotonic decreasing stack to keep track of the indices of the histogram bars.
     * For example [2, 1, 5, 6, 2, 3]
     * i=0: stack is empty, put 0 in stack, stack is [0, 2] (2 is the value of 0 index, will not store in the array)
     * i=1: stack top [0, 2], bigger than 1, so the max area is 2 * 1 = 2, push [1, 1] in the stack, stack is [1, 1]
     * i=2: stack top [1, 1], smaller than 5, push [2, 5] in the stack, the stack is [2, 5], [1, 2]
     * i=3: stack top [2, 5], smaller than 6, push [3, 6] in the stack, the stack is [3, 6], [2, 5], [1, 2]
     * i=4: stack top [3, 6], bigger than 2,  so the max area is 6 * (4-2-1) = 6,
     * stack top now is [2, 5], bigger than 2, so current max is 5 * (4-2-1) = 5, smaller than 6; push [4, 2] in the stack
     * the stack is [4, 2], [1, 2]
     * i=5: stack top [4, 2], smaller than 3, push  [5, 3] in the stack, the stack is [5, 3], [4, 2], [1, 2]
     * i=6, height = 5, width = 6 - 5 - 1
     */
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[i] < heights[stack.peek()])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }

}

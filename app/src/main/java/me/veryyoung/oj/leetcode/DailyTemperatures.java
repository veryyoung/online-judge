package me.veryyoung.oj.leetcode;

import java.util.Stack;

/**
 * 739. Daily Temperatures
 * https://leetcode.com/problems/daily-temperatures/
 */
public class DailyTemperatures {

    /**
     * Use a monotonic decreasing stack to keep track of the indices of temperatures that haven't found a warmer day yet.
     * For example [73, 74, 75, 71, 69, 72, 76, 73]
     * i=0: stack is empty, put 0 in stack, stack is [0, 73] (73 is the value of 0 index, will not store in the array)
     * i=1: stack top [0, 73], smaller than 74, so the result[0] = 1 - 0 = 1; push [1, 74] in the stack, stack is [1, 74]
     * i=2: stack top [1, 74], smaller than 75, so the result[1] = 2 - 1 = 1; push [2, 75] in the stack, stack is [2, 75]
     * i=3: stack top [2, 75], bigger than 71, push [3, 71] in the stack, stack is [3, 71]、[2, 75]
     * i=4: stack top [3, 71], bigger than 69, push [4, 69] in the stack, stack is [4, 69], [3, 71]、[2, 75]
     * i=5: stack top [4, 69], smaller than 72, so the result[4] = 5 - 4 = 1;   stack top [3, 71]， smaller than 72, result[3] = 5 -3 = 2
     * stack top [2, 75], bigger than 72,  push [5, 72] in the stack, stack is [5, 72]、[2, 75]
     * i=6: stack top [5, 72], smaller than 76, so the result[5] = 6 - 5 = 1;  push [6, 76] in the stack, stack is [6, 76]、[2, 75]
     * i=7: stack top [6, 76], bigger than 73
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;
    }

}

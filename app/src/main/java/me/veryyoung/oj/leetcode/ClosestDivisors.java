package me.veryyoung.oj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1362. Closest Divisors
 * https://leetcode.com/problems/closest-divisors/
 */
public class ClosestDivisors {

    public int[] closestDivisors(int num) {
        int diffCount = 2;
        Map<Integer, Integer> multipliers = new HashMap<>(diffCount);
        for (int count = diffCount; count > 0; count--) {
            for (int i = (int) Math.sqrt(num + count); i > 0; i--) {
                if ((num + count) % i == 0) {
                    multipliers.put((num + count) / i, i);
                    break;
                }
            }
        }

        int smallest = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;
        for (Integer bigger : multipliers.keySet()) {
            int smaller = multipliers.get(bigger);
            int diff = bigger - smaller;
            if (smallest > diff) {
                smallest = diff;
                first = smaller;
                second = bigger;
            }
        }
        return new int[]{first, second};
    }

}

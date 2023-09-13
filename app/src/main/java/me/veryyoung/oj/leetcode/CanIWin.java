package me.veryyoung.oj.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 464. Can I
 * https://leetcode.com/problems/can-i-win/
 */
public class CanIWin {

    /**
     * If the sum from 1 to maxChoosableInteger is less than desiredTotal, I can never win
     * Use a boolean array used to store whether the integer was used
     * Use a map to store the calculated process Map<String, Boolean> memo, the string key is the used array to string
     * Backtrack to try the used array and memo map, traversal the every used integer
     * Time complexity is O(n*2^n)
     */
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if ((1 + maxChoosableInteger) * maxChoosableInteger / 2 < desiredTotal) {
            return false;
        }
        if (desiredTotal <= 0) {
            return true;
        }

        boolean[] used = new boolean[maxChoosableInteger];
        Map<Integer, Boolean> memo = new HashMap<>();
        return backtrack(memo, used, desiredTotal);
    }

    private boolean backtrack(Map<Integer, Boolean> memo, boolean[] used, int desiredTotal) {
        int key = Arrays.hashCode(used);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        for (int i = 0; i < used.length; i++) {
            if (!used[i]) {
                used[i] = true;
                if (desiredTotal <= i + 1 || !backtrack(memo, used, desiredTotal - i - 1)) {
                    memo.put(key, true);
                    used[i] = false;
                    return true;
                }
                used[i] = false;
                memo.put(key, false);
            }
        }
        return false;
    }

}

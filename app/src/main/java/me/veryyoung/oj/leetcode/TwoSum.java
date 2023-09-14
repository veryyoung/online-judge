package me.veryyoung.oj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if (numToIndex.containsKey(left)) {
                return new int[]{numToIndex.get(left), i};
            }
            numToIndex.put(nums[i], i);
        }
        return null;
    }
}

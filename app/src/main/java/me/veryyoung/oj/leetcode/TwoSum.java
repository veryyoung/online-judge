package me.veryyoung.oj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) return null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(target - nums[i], i);
            } else {
                int index = map.get(nums[i]);
                if (index < i) {
                    return new int[]{index + 1, i + 1};
                }
            }
        }
        return null;
    }
}

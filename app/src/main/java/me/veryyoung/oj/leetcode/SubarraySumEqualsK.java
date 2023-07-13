package me.veryyoung.oj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. Subarray Sum Equals K
 * https://leetcode.com/problems/subarray-sum-equals-k/
 */
public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> occurCount = new HashMap<>();
        occurCount.put(0, 1);
        int sum = 0;
        for (int num : nums) {
            sum += num;
            int diff = sum - k;
            if (occurCount.containsKey(diff)) {
                count += occurCount.get(diff);
            }
            occurCount.put(sum, occurCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public int onSubarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = nums[start];
            if (sum == k) {
                count++;
            }
            for (int current = start + 1; current < nums.length; current++) {
                sum += nums[current];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

}

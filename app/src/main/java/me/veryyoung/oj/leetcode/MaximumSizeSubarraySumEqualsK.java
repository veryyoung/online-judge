package me.veryyoung.oj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 325. Maximum Size Subarray Sum Equals k
 * https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/
 */
public class MaximumSizeSubarraySumEqualsK {

    /**
     * Use a map, key is sum from 0 to i, value is i
     * So if the map contains sum-k, the sum array is from map.get(sum-k) to i
     */
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> sumToIndex = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                maxLength = Math.max(i + 1, maxLength);
            } else if (sumToIndex.containsKey(sum - k)) {
                maxLength = Math.max(i - sumToIndex.get(sum - k), maxLength);
            }

            if (!sumToIndex.containsKey(sum)) {
                sumToIndex.put(sum, i);
            }
        }
        return maxLength;
    }

}

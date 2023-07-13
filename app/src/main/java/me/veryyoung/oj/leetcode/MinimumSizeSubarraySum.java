package me.veryyoung.oj.leetcode;

/**
 * 209. Minimum Size Subarray Sum
 * https://leetcode.com/problems/minimum-size-subarray-sum/description/
 */
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

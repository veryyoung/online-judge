package me.veryyoung.oj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 3Sum
 * https://leetcode.com/problems/3sum/
 */
public class ThreeSum {

    /**
     * Sort the nums first.
     * Traverse the array, and find the target number 0 - nums[i]  by two sum
     * <p>
     * Time complexity is O(n) * O(n)
     * Space complexity is O(n)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> returnArray = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int target = 0 - nums[i];
            int start = i + 1, end = length - 1;
            while (start < end) {
                if (nums[start] + nums[end] == target) {
                    returnArray.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    while (start < end && nums[start] == nums[start - 1]) start++;
                    while (start < end && nums[end] == nums[end + 1]) end--;
                } else if (nums[start] + nums[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }
            while (i < length - 1 && nums[i] == nums[i + 1]) i++;
        }
        return returnArray;
    }

}

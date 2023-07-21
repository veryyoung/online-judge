package me.veryyoung.oj.leetcode;

import java.util.Arrays;

/**
 * 31. Next Permutation
 * https://leetcode.com/problems/next-permutation/
 * <p>
 * https://en.wikipedia.org/wiki/Permutation#Generation_in_lexicographic_order
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i < 0) {
            Arrays.sort(nums);
            return;
        }
        int j = nums.length - 1;
        while (nums[j] <= nums[i] && j >= 0) {
            j--;
        }

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        Arrays.sort(nums, i + 1, nums.length);
    }

}

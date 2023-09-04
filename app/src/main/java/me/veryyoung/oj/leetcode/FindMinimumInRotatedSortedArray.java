package me.veryyoung.oj.leetcode;

/**
 * 153. Find Minimum in Rotated Sorted Array
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class FindMinimumInRotatedSortedArray {

    /**
     * We need to use binary search to handle this problem, because O(log n) time is needed
     * The array is partially ordered, so we need to find the rotate point
     * Initial two variable left=0 and right=nums.length-1, mid = (left + right) / 2;
     * If nums[mid] is greater than nums[right], it means the minimum element is in the right half of the array. Move left to mid + 1.
     * If nums[mid] is less than nums[right], it means the minimum element is in the left half of the array. Move right to mid.
     * If nums[mid] is equal to nums[right], we can't determine which half to search, so we decrement right.
     */
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return nums[left];
    }

}

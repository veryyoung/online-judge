package me.veryyoung.oj.leetcode;

/**
 * 852. Peak Index in a Mountain Array
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 */
public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        int left = 0, right = A.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (A[middle] < A[middle + 1]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
}

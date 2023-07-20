package me.veryyoung.oj.leetcode;

/**
 * 42. Trapping Rain Water
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;
        int leftMax = height[left];
        int rightMax = height[right];
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += (leftMax - height[left]);
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    water += (rightMax - height[right]);
                }
                right--;
            }
        }
        return water;
    }

}

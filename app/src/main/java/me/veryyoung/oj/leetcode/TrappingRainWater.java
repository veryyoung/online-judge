package me.veryyoung.oj.leetcode;

/**
 * 42. Trapping Rain Water
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWater {

    /**
     * The amount of water for height[i] is determined by the left max height and right max height
     * water[i] = min(max(height[0..i]), max(height[i..end])) - height[i]
     * Use two numbers leftMax and leftMax to store the max part, and two pointer left and right two traversal the arr
     * If height[left] is smaller than height[right], if height[left] bigger than leftMax, replace the leftMax, else, count the water
     * Else  if height[right] bigger than rightMax,  replace the rightMax, else count the water
     */
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

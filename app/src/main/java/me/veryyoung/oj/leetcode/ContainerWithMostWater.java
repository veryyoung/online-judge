package me.veryyoung.oj.leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxarea = 0;
        while (i < j) {
            int tempMaxArea = 0;
            if (height[i] < height[j]) {
                tempMaxArea = height[i] * (j - i);
                i++;
            } else {
                tempMaxArea = height[j] * (j - i);
                j--;
            }
            if (tempMaxArea > maxarea) maxarea = tempMaxArea;
        }
        return maxarea;

    }
}
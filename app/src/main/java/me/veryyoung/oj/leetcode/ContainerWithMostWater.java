package me.veryyoung.oj.leetcode;

/**
 * 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {

    /**
     * Use begin and end two index to traverse the array,
     * area = min(height[begin], height[end]) * (end - start)
     * if height[begin] is less than height[end], begin++, the area will have chance to get bigger
     * if height[begin] is bigger than height[end], end --, the area will have chance to get bigger
     * <p>
     * If we don't move the bigger one, we won't lose any one bigger.
     */
    public int maxArea(int[] height) {
        int begin = 0, end = height.length - 1;
        int maxArea = 0;
        while (begin < end) {
            maxArea = height[begin] < height[end] ?
                    Math.max(maxArea, (end - begin) * height[begin++]) :
                    Math.max(maxArea, (end - begin) * height[end--]);
        }
        return maxArea;
    }

}

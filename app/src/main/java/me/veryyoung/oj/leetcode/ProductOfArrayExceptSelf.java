package me.veryyoung.oj.leetcode;

/**
 * 238. Product of Array Except Self
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductOfArrayExceptSelf {
    /**
     * We can't use division.
     * Use two arrays, left and right, left part store the numbers product of the left,
     * and right store the numbers product of the right.
     * For example [1,2,3,4]
     * left[0] = 1, left[1] = 1*1=1, left[2] = 1*2=2, left[3] = 2*3=6
     * right[0] = 1, right[1] = 1*4=4, right[2] = 4*3=12, right[3] = 12*2=24
     * result[i] = left[i] * right[length - i - 1]
     * result[0] = left[0] * right[4-0-1] = 1 * 24 = 24
     * result[1] = left[1] * right[4-1-1] = 1 * 12 = 12
     * result[2] = left[2] * right[4-2-1] = 2 * 4 = 8
     * result[3] = left[3] * right[4-3-1] = 6 * 1 = 6
     * <p>
     * Time complexity is O(n)
     * Space complexity is 3*O(n) = O(n)
     */

    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        leftProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }

        int[] rightProduct = new int[nums.length];
        rightProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            rightProduct[i] = rightProduct[i - 1] * nums[nums.length - i];
        }


        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct[i] * rightProduct[nums.length - i - 1];
        }

        return result;
    }

}

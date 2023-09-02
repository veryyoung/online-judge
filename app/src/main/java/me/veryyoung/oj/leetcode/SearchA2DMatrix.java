package me.veryyoung.oj.leetcode;

/**
 * 74. Search a 2D Matrix
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
public class SearchA2DMatrix {

    /**
     * Use binary search to find the target index.
     * The right is matrix.length * matrix[0].length - 1, mid = (left + right) / 2
     * col = mid % matrix[0].length, row =  mid / matrix[0].length
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int colLength = matrix[0].length;
        int left = 0;
        int right = matrix.length * colLength - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / colLength][mid % colLength];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

}

package me.veryyoung.oj.leetcode;

/**
 * 832. Flipping an Image
 * https://leetcode.com/problems/flipping-an-image/description/
 */
public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int subArrayLength = A[i].length;
            for (int j = 0; j < subArrayLength / 2; j++) {
                int temp = A[i][j];
                A[i][j] = invert(A[i][subArrayLength - j - 1]);
                A[i][subArrayLength - j - 1] = invert(temp);
            }
            if (subArrayLength % 2 == 1) {
                A[i][subArrayLength / 2] = invert(A[i][subArrayLength / 2]);
            }
        }
        return A;
    }

    public int invert(int input) {
        return input == 0 ? 1 : 0;
    }

}

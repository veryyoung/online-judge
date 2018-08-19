package me.veryyoung.oj.leetcode;

import static org.junit.Assert.assertEquals;

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


    public static void main(String[] args) {
        FlippingAnImage instance = new FlippingAnImage();
        int[][] input4 = {{1, 1, 0}};
        int[][] output4 = {{1, 0, 0}};
        assertEquals(output4, instance.flipAndInvertImage(input4));

        int[][] input1 = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] output1 = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        assertEquals(output1, instance.flipAndInvertImage(input1));

        int[][] input2 = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] output2 = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        assertEquals(output2, instance.flipAndInvertImage(input2));

        int[][] input3 = {{1}};
        int[][] output3 = {{0}};
        assertEquals(output3, instance.flipAndInvertImage(input3));


    }
}

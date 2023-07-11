package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlippingAnImage1Test {

    @Test
    public void testClearZero() {
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
package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SpiralMatrixTest {

    @Test
    public void testSpiralOrder() {
        SpiralMatrix instance = new SpiralMatrix();
        assertArrayEquals(new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, instance.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6},
                {7, 8, 9}}).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7}, instance.spiralOrder(new int[][]{
                {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{7, 9, 6}, instance.spiralOrder(new int[][]{{7}, {9}, {6}}).stream()
                .mapToInt(Integer::intValue).toArray());
    }

}

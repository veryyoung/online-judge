package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextPermutationTest {

    @Test
    public void testNextPermutation() {
        NextPermutation instance = new NextPermutation();

        int[] case1 = new int[]{1, 2, 3};
        instance.nextPermutation(case1);
        assertArrayEquals(new int[]{1, 3, 2}, case1);

        int[] case2 = new int[]{3, 2, 1};
        instance.nextPermutation(case2);
        assertArrayEquals(new int[]{1, 2, 3}, case2);

        int[] case3 = new int[]{1, 1, 5};
        instance.nextPermutation(case3);
        assertArrayEquals(new int[]{1, 5, 1}, case3);
    }

}

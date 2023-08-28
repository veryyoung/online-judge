package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void testProductExceptSelf() {
        ProductOfArrayExceptSelf instance = new ProductOfArrayExceptSelf();
        assertArrayEquals(new int[]{24, 12, 8, 6}, instance.productExceptSelf(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, instance.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

}

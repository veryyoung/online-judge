package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void testMaxProfit() {
        BestTimeToBuyAndSellStock instance = new BestTimeToBuyAndSellStock();
        assertEquals(5, instance.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, instance.maxProfit(new int[]{7, 6, 4, 3, 1}));
        assertEquals(1, instance.maxProfit(new int[]{1, 2}));
        assertEquals(0, instance.maxProfit(new int[]{2, 1}));
    }

}

package me.veryyoung.oj.hackerrank;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MiniMaxSumTest {

    @Test
    public void testMiniMaxSum() {
        MiniMaxSum instance = new MiniMaxSum();
        List<Integer> input0 = Arrays.asList(1, 3, 5, 7, 9);
        assertEquals("16 24", instance.miniMaxSum(input0));

        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals("10 14", instance.miniMaxSum(input1));
    }
}

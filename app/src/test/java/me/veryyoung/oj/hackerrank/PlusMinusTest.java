package me.veryyoung.oj.hackerrank;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class PlusMinusTest {

    @Test
    public void testPlusMinus() {
        PlusMinus instance = new PlusMinus();
        List<Integer> input0 = Arrays.asList(1, 1, 0, -1, -1);
        String[] output0 = {"0.400000", "0.400000", "0.200000"};
        assertArrayEquals(output0, instance.plusMinus(input0));

        List<Integer> input1 = Arrays.asList(-4, 3, -9, 0, 4, 1);
        String[] output1 = {"0.500000", "0.333333", "0.166667"};
        assertArrayEquals(output1, instance.plusMinus(input1));
    }
}

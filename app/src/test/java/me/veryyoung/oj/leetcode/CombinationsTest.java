package me.veryyoung.oj.leetcode;

import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class CombinationsTest {

    @Test
    public void testCombine() {
        Combinations instance = new Combinations();
        assertArrayEquals(new int[][]{{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}}, toArray(instance.combine(4, 2)));
        assertArrayEquals(new int[][]{{1, 2, 3}, {1, 2, 4}, {1, 3, 4}, {2, 3, 4}}, toArray(instance.combine(4, 3)));
        assertArrayEquals(new int[][]{{1}}, toArray(instance.combine(1, 1)));
    }

    private int[][] toArray(List<List<Integer>> list) {
        Collections.sort(list, Comparator.comparing(list2 -> list2.get(0)));

        int row = list.size();
        int column = list.get(0).size();
        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = list.get(i).get(j);
            }
        }
        return array;
    }
}

package me.veryyoung.oj.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayUtils {

    public static int[][] toArray(List<List<Integer>> list) {
        if (list == null || list.size() == 0) {
            return new int[][]{};
        }
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

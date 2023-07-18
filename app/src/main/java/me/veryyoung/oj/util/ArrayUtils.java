package me.veryyoung.oj.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayUtils {

    public static int[][] toArrayIgnoreOrder(List<List<Integer>> list) {
        return toArray(list, true);
    }

    public static int[][] toArray(List<List<Integer>> list) {
        return toArray(list, false);
    }

    public static int[][] toArray(List<List<Integer>> list, boolean ignoreOrder) {
        if (list == null || list.size() == 0) {
            return new int[][]{};
        }
        if (ignoreOrder) {
            Collections.sort(list, Comparator.comparing(list2 -> list2.get(0)));
        }
        int row = list.size();
        int column = list.get(0).size();
        for (List<Integer> secondList : list) {
            column = Math.max(column, secondList.size());
        }
        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (list.get(i).size() > j) {
                    array[i][j] = list.get(i).get(j);
                }
            }
        }
        return array;
    }

    public static Integer[][] toIntegerArray(List<List<Integer>> list) {
        if (list == null || list.size() == 0) {
            return new Integer[][]{};
        }
        int row = list.size();
        int column = list.get(0).size();
        for (List<Integer> secondList : list) {
            column = Math.max(column, secondList.size());
        }
        Integer[][] array = new Integer[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (list.get(i).size() > j) {
                    array[i][j] = list.get(i).get(j);
                }
            }
        }
        return array;
    }

}

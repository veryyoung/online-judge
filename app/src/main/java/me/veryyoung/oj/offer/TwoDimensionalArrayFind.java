package me.veryyoung.oj.offer;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 输入描述:
 * array： 待查找的二维数组
 * target：查找的数字
 * <p/>
 * <p/>
 * 输出描述:
 * 查找到返回true，查找不到返回false
 * <p/>
 */
public class TwoDimensionalArrayFind {

    public boolean find(int[][] array, int target) {
        if (null == array || array.length == 0 || array[0].length == 0) {
            return false;
        }

        if (array[0][0] > target || array[array.length - 1][array[0].length - 1] < target) {
            return false;
        }

        int x = 0, y = array.length - 1;

        while (x < array[0].length && y >= 0) {
            if (array[y][x] == target) {
                return true;
            } else if (array[y][x] < target) {
                x++;
            } else {
                y--;
            }
        }

        return false;
    }

}
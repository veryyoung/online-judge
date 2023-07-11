package me.veryyoung.oj.cc150;

/**
 * 请编写一个算法，若MxN矩阵中某个元素为0，则将其所在的行与列清零。
 * 给定一个MxN的int[][]矩阵(C++中为vector>)mat和矩阵的阶数n，请返回完成操作后的int[][]矩阵(C++中为vector>)，保证n小于等于300，矩阵中的元素为int范围内。
 * 测试样例：
 * [[1,2,3],[0,1,2],[0,0,1]]
 * 返回：[[0,0,3],[0,0,0],[0,0,0]]
 * <p>
 */
public class Clearer {

    public int[][] clearZero(int[][] mat, int n) {
        boolean[] rowZero = new boolean[n];
        boolean[] columnZero = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    rowZero[i] = true;
                    columnZero[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rowZero[i] || columnZero[j]) {
                    mat[i][j] = 0;
                }
            }
        }

        return mat;
    }
}

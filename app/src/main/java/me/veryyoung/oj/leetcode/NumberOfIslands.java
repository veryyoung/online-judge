package me.veryyoung.oj.leetcode;

/**
 * 200. Number of Islands
 * https://leetcode.com/problems/number-of-islands/
 */
public class NumberOfIslands {

    /**
     * Traversal every char of the grid, if the char is 1, mark the up、down、left、right 1 to 0
     */
    public int numIslands(char[][] grid) {
        int rowLength = grid.length;
        int cowLength = grid[0].length;
        int nums = 0;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < cowLength; j++) {
                if (grid[i][j] == '1') {
                    nums++;
                    markSea(i, j, rowLength, cowLength, grid);
                }
            }
        }
        return nums;
    }

    private void markSea(int i, int j, int rowLength, int cowLength, char[][] grid) {
        if (i == -1 || j == -1 || i == rowLength || j == cowLength || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        markSea(i - 1, j, rowLength, cowLength, grid);
        markSea(i, j - 1, rowLength, cowLength, grid);
        markSea(i + 1, j, rowLength, cowLength, grid);
        markSea(i, j + 1, rowLength, cowLength, grid);
    }

}

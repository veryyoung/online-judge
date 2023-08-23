package me.veryyoung.oj.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 36. Valid Sudoku
 * https://leetcode.com/problems/valid-sudoku/
 */
public class ValidSudoku {

    /**
     * Traversal from 1 to 9, in the process, use three set to store the value of cols、cows、cubes(3*3)
     * check if the value is existed, if one value is existed, return false
     * <p>
     * <p>
     *
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> cols = new HashSet<>();
            Set<Character> rows = new HashSet<>();
            Set<Character> cubes = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char colValue = board[i][j];
                if (colValue != '.') {
                    if (cols.contains(colValue)) {
                        return false;
                    }
                    cols.add(colValue);
                }

                char rowValue = board[j][i];
                if (rowValue != '.') {
                    if (rows.contains(rowValue)) {
                        return false;
                    }
                    rows.add(rowValue);
                }

                /**
                 * 00 01 02 03 04 05 06 07 08
                 * 10 11 12 13 14 15 16 17 18
                 * 20 21 22 23 24 25 26 27 28
                 * 30 31 32 33 34 35 36 37 38
                 * 40 41 42 43 44 45 46 47 48
                 * 50 51 52 53 54 55 56 57 58
                 * 60 61 62 63 64 65 66 67 68
                 * 70 71 72 73 74 75 76 77 78
                 * 80 81 82 83 84 85 86 87 68
                 */

                /**
                 * 00 01 02 10 11 12 20 21 22
                 * 03 04 05 13 14 15 23 24 25
                 * 06 07 08 16 17 18 26 27 28
                 * 30 31 32 40 41 42 50 51 52
                 * 33 34 35 43 44 45 53 54 55
                 * 36 37 38 46 47 48 56 57 58
                 * 40 41 42 70 71 72 80 81 82
                 * 43 44 45 73 74 75 83 84 85
                 * 46 47 48 76 77 78 86 87 88
                 */

                char cubeValue = board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3];
                if (cubeValue != '.') {
                    if (cubes.contains(cubeValue)) {
                        return false;
                    }
                    cubes.add(cubeValue);
                }
            }
        }
        return true;
    }


}

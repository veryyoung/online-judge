package me.veryyoung.oj.hackerrank;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {

    public int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonal = 0;
        int rightDiagonals = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonals += arr.get(i).get(arr.size() - i - 1);
        }
        return Math.abs(rightDiagonals - leftDiagonal);
    }

}

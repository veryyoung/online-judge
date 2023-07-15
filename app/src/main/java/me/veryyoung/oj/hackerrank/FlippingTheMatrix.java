package me.veryyoung.oj.hackerrank;

import java.util.List;

public class FlippingTheMatrix {

    public int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size();
        int sum = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int leftUp = matrix.get(i).get(j);
                int leftDown = matrix.get(i).get(n - j - 1);
                int rightUp = matrix.get(n - i - 1).get(j);
                int rightDown = matrix.get(n - i - 1).get(n - j - 1);
                sum += Math.max(Math.max(Math.max(leftUp, leftDown), rightUp), rightDown);
            }
        }
        return sum;
    }

}

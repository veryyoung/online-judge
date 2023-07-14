package me.veryyoung.oj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. Combinations
 * https://leetcode.com/problems/combinations/
 */
public class Combinations {

    //  C(n, k) = C(n - 1, k) + nC(n - 1, k - 1)
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        if (k == 0) {
            results.add(new ArrayList<>());
            return results;
        }
        if (n == k) {
            List<Integer> items = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                items.add(i);
            }
            results.add(items);
            return results;
        }
        results = combine(n - 1, k);
        for (List<Integer> combines : combine(n - 1, k - 1)) {
            combines.add(n);
            results.add(combines);
        }
        return results;
    }

}

package me.veryyoung.oj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 * https://leetcode.com/problems/permutations/
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        dfs(results, new ArrayList<>(nums.length), nums);
        return results;
    }

    private void dfs(List<List<Integer>> results, List<Integer> current, int[] nums) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current));
            return;
        }
        for (int num : nums) {
            if (current.contains(num)) {
                continue;
            }
            current.add(num);
            dfs(results, current, nums);
            current.remove(current.size() - 1);
        }
    }

}

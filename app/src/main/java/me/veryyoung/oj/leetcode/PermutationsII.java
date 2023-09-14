package me.veryyoung.oj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 46. Permutations
 * https://leetcode.com/problems/permutations/
 */
public class PermutationsII {

    /**
     * Same with the Permutations question, but can't use contains to judge number occurs
     * Use a boolean array store the index of the number to judge whether the num used
     * <p>
     * And need to remote the dum duplicated results
     * Sort the nums first, and skip the duplicated number when backtrack
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(results, new ArrayList<>(nums.length), nums, new boolean[nums.length]);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> current, int[] nums, boolean[] used) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            current.add(nums[i]);
            backtrack(results, current, nums, used);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

}

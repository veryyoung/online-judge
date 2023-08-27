package me.veryyoung.oj.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

    /**
     * Use a set to store the if numbers appears
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> appears = new HashSet<>();
        for (int num : nums) {
            if (appears.contains(num)) {
                return true;
            }
            appears.add(num);
        }
        return false;
    }

}

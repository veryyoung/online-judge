package me.veryyoung.oj.leetcode;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * 128. Longest Consecutive Sequence
 * https://leetcode.com/problems/longest-consecutive-sequence/description/
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (null == nums || 0 == nums.length) {
            return 0;
        }
        Set<Integer> sets = new HashSet<>(nums.length);
        for (int num : nums) {
            sets.add(num);
        }

        int max = 0;
        for (int num : nums) {
            if (sets.contains(num)) {
                int count = 1;
                sets.remove(num);

                int low = num - 1;
                while (sets.contains(low)) {
                    sets.remove(low);
                    low--;
                    count++;
                }

                int high = num + 1;
                while (sets.contains(high)) {
                    sets.remove(high);
                    high++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence instance = new LongestConsecutiveSequence();
        assertEquals(4, instance.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        assertEquals(1, instance.longestConsecutive(new int[]{0}));
    }
}

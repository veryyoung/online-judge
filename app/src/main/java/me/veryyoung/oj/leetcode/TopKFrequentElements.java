package me.veryyoung.oj.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {


    /**
     * Traversal the nums array, and put the number count in a map, sort the map by value,
     * and get the first k from the sorted values
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsCount = new HashMap<>();
        for (int num : nums) {
            if (numsCount.containsKey(num)) {
                numsCount.put(num, numsCount.get(num) + 1);
            } else {
                numsCount.put(num, 1);
            }
        }
        return numsCount.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue()).map(i -> i.getKey().intValue())
                .toList().subList(0, k)
                .stream().mapToInt(i -> i).toArray();
    }

}

package me.veryyoung.oj.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 215. Kth Largest Element in an Array
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(k, (o1, o2) -> o2 - o1);
        for (int num : nums) {
            queue.offer(num);
        }
        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }
        return queue.poll();
    }

}

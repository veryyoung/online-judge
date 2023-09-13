package me.veryyoung.oj.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 295. Find Median from Data Stream
 * https://leetcode.com/problems/find-median-from-data-stream/
 */
public class FindMedianFromDataStream {

    /**
     * To efficiently find the median, we can use two heaps:
     * a max heap to store the left half of the elements (smaller values),
     * and a min heap to store the right half of the elements (larger values).
     * This allows you to maintain the property that the elements in the max heap are less than or equal to the elements in the min heap.
     * <p>
     * In the addNum method, we first determine which heap to add the number to.
     * If the maxHeap is empty or if the number is less than or equal to the maximum element in the maxHeap, we add it to the maxHeap.
     * Otherwise, we add it to the minHeap.
     * <p>
     * After adding the number, we check the balance of the heaps.
     * If the size of the maxHeap is greater than the size of the minHeap by more than 1,
     * we move the maximum element from the maxHeap to the minHeap to balance them.
     * <p>
     * Similarly, if the minHeap is larger, we move the minimum element from the minHeap to the maxHeap.
     */
    static class MedianFinder {

        private PriorityQueue<Integer> maxHeap;
        private PriorityQueue<Integer> minHeap;

        public MedianFinder() {
            minHeap = new PriorityQueue<>();
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        }

        public void addNum(int num) {
            if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }
        }

        public double findMedian() {
            if (maxHeap.size() == minHeap.size()) {
                return (maxHeap.peek() + minHeap.peek()) / 2.0;
            } else {
                return maxHeap.peek();
            }
        }

    }

}

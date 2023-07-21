package me.veryyoung.oj.leetcode;

import me.veryyoung.oj.util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 23. Merge k Sorted Lists
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        Queue<Integer> mergedList = new PriorityQueue<>(Comparator.comparingInt(o -> o.intValue()));
        for (ListNode list : lists) {
            while (list != null) {
                mergedList.add(list.val);
                list = list.next;
            }
        }
        if (mergedList.size() == 0) {
            return null;
        }
        ListNode result = new ListNode(mergedList.poll());
        ListNode current = result;
        while (mergedList.size() > 0) {
            current.next = new ListNode(mergedList.poll());
            current = current.next;
        }
        return result;
    }

}

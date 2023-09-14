package me.veryyoung.oj.leetcode;

import me.veryyoung.oj.util.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Remove Duplicates from Unsorted List
 * https://leetcode.com/problems/remove-duplicates-from-an-unsorted-linked-list/
 * https://www.codingninjas.com/studio/problems/remove-duplicates-from-unsorted-linked-list_1069331
 */
public class RemoveDuplicatesFromAnUnsortedLinkedList {

    /**
     * Use a set to judge whether the number of the value exists
     */
    public LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        Set<Integer> existedNumbers = new HashSet<>();
        LinkedListNode<Integer> result = new LinkedListNode<>(0);
        LinkedListNode<Integer> pre = result;

        while (head != null) {
            if (!existedNumbers.contains(head.data)) {
                pre.next = head;
                pre = pre.next;
                existedNumbers.add(head.data);
            }
            head = head.next;
        }
        pre.next = null;

        return result.next;
    }


}

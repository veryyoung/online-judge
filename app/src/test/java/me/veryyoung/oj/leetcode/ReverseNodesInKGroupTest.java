package me.veryyoung.oj.leetcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class ReverseNodesInKGroupTest {

    @Test
    public void testReverseKGroup() {
        ReverseNodesInKGroup instance = new ReverseNodesInKGroup();
        assertArrayEquals(new int[]{2, 1, 4, 3, 5}, toArray(instance.reverseKGroup(toNode(new int[]{1, 2, 3, 4, 5}), 2)));
        assertArrayEquals(new int[]{3, 2, 1, 4, 5}, toArray(instance.reverseKGroup(toNode(new int[]{1, 2, 3, 4, 5}), 3)));
        assertArrayEquals(new int[]{2, 1, 4, 3, 6, 5}, toArray(instance.reverseKGroup(toNode(new int[]{1, 2, 3, 4, 5, 6}), 2)));
        assertArrayEquals(new int[]{4, 3, 2, 1, 5, 6}, toArray(instance.reverseKGroup(toNode(new int[]{1, 2, 3, 4, 5, 6}), 4)));
    }

    private ReverseNodesInKGroup.ListNode toNode(int[] arr) {
        ReverseNodesInKGroup.ListNode head = new ReverseNodesInKGroup.ListNode(arr[0]);
        if (arr.length == 1) {
            return head;
        }
        ReverseNodesInKGroup.ListNode current = new ReverseNodesInKGroup.ListNode(arr[1]);
        head.next = current;
        for (int i = 2; i < arr.length; i++) {
            ReverseNodesInKGroup.ListNode node = new ReverseNodesInKGroup.ListNode(arr[i]);
            current.next = node;
            current = node;
        }
        return head;
    }

    private int[] toArray(ReverseNodesInKGroup.ListNode head) {
        List<Integer> list = new LinkedList<>();
        list.add(head.val);
        ReverseNodesInKGroup.ListNode current = head.next;
        while (current.next != null) {
            list.add(current.val);
            current = current.next;
        }
        list.add(current.val);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

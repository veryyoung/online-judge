package me.veryyoung.oj.util;

import java.util.LinkedList;
import java.util.List;

public class ListNode {

    public int val;

    public ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }


    public static int[] toArray(ListNode head) {
        if (head == null || head.next == null) {
            return new int[]{};
        }
        List<Integer> list = new LinkedList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static ListNode toListNode(int[] array) {
        if (array.length == 0) {
            return null;
        }
        ListNode head = new ListNode(array[0]);
        if (array.length == 1) {
            return head;
        }
        ListNode current = new ListNode(array[1]);
        head.next = current;
        for (int i = 2; i < array.length; i++) {
            ListNode node = new ListNode(array[i]);
            current.next = node;
            current = node;
        }
        return head;
    }

}

package me.veryyoung.oj.leetcode;


import me.veryyoung.oj.util.ListNode;

import java.util.Stack;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        stack.push(current.val);
        while (current.next != null) {
            current = current.next;
            stack.push(current.val);
        }

        ListNode result = new ListNode(stack.pop());
        current = result;
        while (!stack.isEmpty()) {
            current.next = new ListNode(stack.pop());
            current = current.next;
        }
        return result;
    }

}

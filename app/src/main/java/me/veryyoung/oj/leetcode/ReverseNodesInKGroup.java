package me.veryyoung.oj.leetcode;


import java.util.Stack;

/**
 * 25. Reverse Nodes in k-Group
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 */
public class ReverseNodesInKGroup {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = null;
        ListNode resultCurrent = null;
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        stack.push(current.val);
        while (current.next != null) {
            current = current.next;
            if (stack.size() == k) {
                ListNode[] nodes = pushStack(result, resultCurrent, stack);
                result = nodes[0];
                resultCurrent = nodes[1];
            }
            stack.push(current.val);
        }
        if (stack.size() == k) {
            ListNode[] nodes = pushStack(result, resultCurrent, stack);
            result = nodes[0];
        } else {
            Stack<Integer> reverseStack = new Stack<>();
            while (!stack.isEmpty()) {
                reverseStack.push(stack.pop());
            }
            while (!reverseStack.isEmpty()) {
                resultCurrent.next = new ListNode(reverseStack.pop());
                resultCurrent = resultCurrent.next;
            }
        }
        return result;
    }

    private static ListNode[] pushStack(ListNode head, ListNode current, Stack<Integer> stack) {
        while (stack.size() > 0) {
            if (head == null) {
                head = new ListNode(stack.pop());
                current = head;
            } else {
                current.next = new ListNode(stack.pop());
                current = current.next;
            }
        }
        return new ListNode[]{head, current};
    }

}

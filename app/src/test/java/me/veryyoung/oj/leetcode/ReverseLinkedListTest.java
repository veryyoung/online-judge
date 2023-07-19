package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static me.veryyoung.oj.util.ListNode.toArray;
import static me.veryyoung.oj.util.ListNode.toListNode;
import static org.junit.Assert.assertArrayEquals;

public class ReverseLinkedListTest {

    @Test
    public void testReverseList() {
        ReverseLinkedList instance = new ReverseLinkedList();
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, toArray(instance.reverseList(toListNode(new int[]{1, 2, 3, 4, 5}))));
        assertArrayEquals(new int[]{2, 1}, toArray(instance.reverseList(toListNode(new int[]{1, 2}))));
        assertArrayEquals(new int[]{}, toArray(instance.reverseList(toListNode(new int[]{}))));
    }

}

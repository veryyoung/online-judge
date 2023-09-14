package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static me.veryyoung.oj.util.LinkedListNode.toArray;
import static me.veryyoung.oj.util.LinkedListNode.toListNode;
import static org.junit.Assert.assertArrayEquals;

public class RemoveDuplicatesFromAnUnsortedLinkedListTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicatesFromAnUnsortedLinkedList instance = new RemoveDuplicatesFromAnUnsortedLinkedList();
        assertArrayEquals(new Integer[]{3, 2, 4}, toArray(instance.removeDuplicates(toListNode(new Integer[]{3, 2, 3, 4, 2, 3}))));
        assertArrayEquals(new Integer[]{4, 2, 5, -1}, toArray(instance.removeDuplicates(toListNode(new Integer[]{4, 2, 5, 4, 2, 2, -1}))));
        assertArrayEquals(new Integer[]{1, 2, 7, -1}, toArray(instance.removeDuplicates(toListNode(new Integer[]{1, 2, 1, 2, 2, 2, 7, 7, -1}))));
        assertArrayEquals(new Integer[]{3, -1}, toArray(instance.removeDuplicates(toListNode(new Integer[]{3, 3, 3, 3, 3, -1}))));
        assertArrayEquals(new Integer[]{10, 20, 30, -1}, toArray(instance.removeDuplicates(toListNode(new Integer[]{10, 20, 10, 20, 30, 10, 20, 30, -1}))));
    }

}

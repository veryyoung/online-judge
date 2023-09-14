package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static me.veryyoung.oj.util.ListNode.toArray;
import static me.veryyoung.oj.util.ListNode.toListNode;
import static org.junit.Assert.assertArrayEquals;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        AddTwoNumbers instance = new AddTwoNumbers();
        assertArrayEquals(new int[]{7, 0, 8}, toArray(instance.addTwoNumbers(toListNode(new int[]{2, 4, 3}),
                toListNode(new int[]{5, 6, 4}))));
        assertArrayEquals(new int[]{0}, toArray(instance.addTwoNumbers(toListNode(new int[]{0}),
                toListNode(new int[]{0}))));
        assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, toArray(instance.addTwoNumbers(
                toListNode(new int[]{9, 9, 9, 9, 9, 9, 9}), toListNode(new int[]{9, 9, 9, 9}))));
    }

}

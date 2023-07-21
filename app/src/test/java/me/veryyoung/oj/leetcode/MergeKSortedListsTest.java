package me.veryyoung.oj.leetcode;

import me.veryyoung.oj.util.ListNode;
import org.junit.Test;

import static me.veryyoung.oj.util.ListNode.toArray;
import static me.veryyoung.oj.util.ListNode.toListNode;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MergeKSortedListsTest {

    @Test
    public void testMergeKLists() {
        MergeKSortedLists instance = new MergeKSortedLists();
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, toArray(instance.mergeKLists(
                new ListNode[]{toListNode(new int[]{1, 4, 5}), toListNode(new int[]{1, 3, 4}),
                        toListNode(new int[]{2, 6})})));

        assertEquals(null, instance.mergeKLists(new ListNode[]{toListNode(new int[]{})}));
    }


}

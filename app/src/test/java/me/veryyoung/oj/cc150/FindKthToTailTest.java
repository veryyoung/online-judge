package me.veryyoung.oj.cc150;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindKthToTailTest {

    @Test
    public void testFindKthToTail() {
        FindKthToTail findKthToTail = new FindKthToTail();
        assertEquals(null, findKthToTail.findKthToTail(null, 0));

        ListNode listNode = new ListNode(1);
        assertEquals(listNode.val, findKthToTail.findKthToTail(listNode, 1).val);


        listNode.next = new ListNode(2);
        assertEquals(2, findKthToTail.findKthToTail(listNode, 1).val);

        listNode.next.next = new ListNode(3);
        assertEquals(3, findKthToTail.findKthToTail(listNode, 1).val);

        assertEquals(2, findKthToTail.findKthToTail(listNode, 2).val);

        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode result = findKthToTail.findKthToTail(listNode, 5);
        assertEquals(1, result.val);
    }
}
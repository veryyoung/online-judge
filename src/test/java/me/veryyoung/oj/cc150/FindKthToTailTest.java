package me.veryyoung.oj.cc150;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by veryyoung on 2016/2/3.
 */
public class FindKthToTailTest {

    @Test
    public void testFindKthToTail() {
        FindKthToTail findKthToTail = new FindKthToTail();
        Assert.assertEquals(null, findKthToTail.findKthToTail(null, 0));

        ListNode listNode = new ListNode(1);
        Assert.assertEquals(listNode.val, findKthToTail.findKthToTail(listNode, 1).val);


        listNode.next = new ListNode(2);
        Assert.assertEquals(2, findKthToTail.findKthToTail(listNode, 1).val);

        listNode.next.next = new ListNode(3);
        Assert.assertEquals(3, findKthToTail.findKthToTail(listNode, 1).val);

        Assert.assertEquals(2, findKthToTail.findKthToTail(listNode, 2).val);

        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode result = findKthToTail.findKthToTail(listNode, 5);
        Assert.assertEquals(1, result.val);
    }
}
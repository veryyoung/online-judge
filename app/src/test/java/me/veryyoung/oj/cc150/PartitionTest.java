package me.veryyoung.oj.cc150;

import me.veryyoung.oj.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartitionTest {

    @Test
    public void testPartition() {
        Partition partition = new Partition();
        assertEquals(null, partition.partition(null, 1));

        ListNode listNode = new ListNode(1);
        assertEquals(listNode, partition.partition(listNode, 1));


        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(5);
        listNode.next.next.next.next = new ListNode(4);

        ListNode expect = new ListNode(1);
        expect.next = new ListNode(2);
        expect.next.next = new ListNode(3);
        expect.next.next.next = new ListNode(5);
        expect.next.next.next.next = new ListNode(4);

        ListNode result = partition.partition(listNode, 3);
        assertEquals(expect.val, result.val);
        assertEquals(expect.next.next.val, result.next.next.val);
        assertEquals(expect.next.next.next.val, result.next.next.next.val);
        assertEquals(expect.next.next.next.next.val, result.next.next.next.next.val);
        assertEquals(expect.next.next.next.next.next, result.next.next.next.next.next);

    }
}
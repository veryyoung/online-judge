package me.veryyoung.oj.cc150;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yangxiongwei on 2016/2/16.
 */
public class PartitionTest {

    @Test
    public void testPartition() {
        Partition partition = new Partition();
        Assert.assertEquals(null, partition.partition(null, 1));

        ListNode listNode = new ListNode(1);
        Assert.assertEquals(listNode, partition.partition(listNode, 1));


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
        Assert.assertEquals(expect, result);

    }
}
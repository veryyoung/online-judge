package me.veryyoung.oj.leetcode;

import me.veryyoung.oj.util.ListNode;
import org.junit.Test;

import static me.veryyoung.oj.util.ListNode.toArray;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void testGetIntersectionNode() {
        IntersectionOfTwoLinkedLists instance = new IntersectionOfTwoLinkedLists();
        ListNode[] case1 = generateCase1();
        assertArrayEquals(new int[]{8, 4, 5}, toArray(instance.getIntersectionNode(case1[0], case1[1])));

        ListNode[] case2 = generateCase2();
        assertArrayEquals(new int[]{2, 4}, toArray(instance.getIntersectionNode(case2[0], case2[1])));

        ListNode[] case3 = generateCase3();
        assertEquals(null, instance.getIntersectionNode(case3[0], case3[1]));
    }

    private ListNode[] generateCase1() {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode node1 = new ListNode(4);
        node1.next = new ListNode(1);
        node1.next.next = common;

        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(1);
        node2.next.next.next = common;

        return new ListNode[]{node1, node2};
    }

    private ListNode[] generateCase2() {
        ListNode common = new ListNode(2);
        common.next = new ListNode(4);

        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(9);
        node1.next.next = new ListNode(1);
        node1.next.next.next = common;

        ListNode node2 = new ListNode(3);
        node2.next = common;

        return new ListNode[]{node1, node2};
    }


    private ListNode[] generateCase3() {
        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(6);
        node1.next.next = new ListNode(4);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(5);

        return new ListNode[]{node1, node2};
    }


}

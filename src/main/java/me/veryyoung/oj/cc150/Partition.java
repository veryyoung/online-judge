package me.veryyoung.oj.cc150;

/**
 * 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
 * 给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
 * <p>
 * Created by veryyoung on 2016/2/4.
 */
public class Partition {

    public ListNode partition(ListNode pHead, int x) {
        if (null == pHead || pHead.next == null) {
            return pHead;
        }

        ListNode beforeStart = null, beforeEnd = null, afterStart = null, afterEnd = null, node = pHead;

        //是否已有头结点
        boolean flag1 = false;
        boolean flag2 = false;

        while (node != null) {
            if (node.val < x) {
                if (!flag1) {
                    flag1 = true;
                    beforeStart = new ListNode(node.val);
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = new ListNode(node.val);
                    beforeEnd = beforeEnd.next;
                }
            } else {
                if (!flag2) {
                    flag2 = true;
                    afterStart = new ListNode(node.val);
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = new ListNode(node.val);
                    afterEnd = afterEnd.next;
                }
            }
            node = node.next;
        }

        if (null == beforeStart) {
            return afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;
    }
}

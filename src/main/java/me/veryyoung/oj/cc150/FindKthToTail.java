package me.veryyoung.oj.cc150;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * Created by veryyoung on 2016/2/3.
 */
public class FindKthToTail {

    /**
     * 方案一：压栈
     * 方案二：遍历一次，得到长度 length，再找第 length-k+1 个结点
     * 方案三：快慢指针
     * <p>
     * <p>
     * 这里采用方案三
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode findKthToTail(ListNode head, int k) {
        if (null == head || head.next == null) {
            return head;
        }
        if (k <= 0) {
            return null;
        }

        ListNode fastList = head;
        ListNode slowList = head;
        for (int i = 1; i <= k; i++) {
            if (fastList == null) {
                return null;
            }
            fastList = fastList.next;
        }

        while (fastList != null) {
            fastList = fastList.next;
            slowList = slowList.next;
        }
        return slowList;
    }
}

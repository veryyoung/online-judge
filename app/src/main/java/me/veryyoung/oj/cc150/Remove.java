package me.veryyoung.oj.cc150;

/**
 * 实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。
 * 给定带删除的节点，请执行删除操作，若该节点为尾节点，返回false，否则返回true
 * <p>
 */
public class Remove {

    /**
     * 删除当前结点就是把 next 结点的值复制过来，把当前结点的 next 指向 next.next，相当于删除了下一个结点
     *
     * @param pNode
     * @return
     */
    public boolean removeNode(ListNode pNode) {
        if (pNode.next == null) {
            return false;
        }
        pNode.val = pNode.next.val;
        pNode.next = pNode.next.next;
        return true;
    }
}

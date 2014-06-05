/**
 * Created with IntelliJ IDEA.
 * User: veryyoung
 * Email:codingyoung@gmail.com
 * Date: 14-4-16
 * Time: 下午9:21
 * To change this template use File | Settings | File Templates.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode list1 = l1, list2 = l2, result = new ListNode(-1), head = result;
        while(list1 != null || list2 != null) {
            if(list1 != null) {
                carry += list1.val;
                list1 = list1.next;
            }
            if(list2 != null) {
                carry += list2.val;
                list2 = list2.next;
            }

            if(carry >= 10) {
                result.next = new ListNode(carry - 10);
                carry = 1;
            } else {
                result.next = new ListNode(carry);
                carry = 0;
            }

            result = result.next;
        }
        if(carry == 1) result.next = new ListNode(1);
        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}

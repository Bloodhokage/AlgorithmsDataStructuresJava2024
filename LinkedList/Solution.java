package LinkedList;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return new ListNode();
        }

        ListNode head = new ListNode();
        ListNode cur = head;

        while (list1 != null && list2 != null) {
            if (list1.getVal() <= list2.getVal()) {
                cur.next = list1;
                list1 = list1.next;
            }
            else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        if (list1 == null) {
            cur.next = list2;
        }
        else {
            cur.next = list1;
        }

        return head.next;

    }
}
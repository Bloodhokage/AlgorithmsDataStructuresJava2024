package LinkedList;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // list1 = [1, 2, 4], list2 = [1, 3, 4]
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode mergedList1 = solution.mergeTwoLists(list1, list2);
        System.out.println(mergedList1);

        // list1 = [], list2 = []
        ListNode list3 = null;
        ListNode list4 = null;
        ListNode mergedList2 = solution.mergeTwoLists(list3, list4);
        System.out.println(mergedList2);

        // list1 = [], list2 = [0]
        ListNode list5 = null;
        ListNode list6 = new ListNode(0, null);
        ListNode mergedList3 = solution.mergeTwoLists(list5, list6);
        System.out.println(mergedList3);
    }
}
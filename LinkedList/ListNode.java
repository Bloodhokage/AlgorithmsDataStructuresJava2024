package LinkedList;
final class ListNode {
    private final int val;
    ListNode next;

    public ListNode() {
        this.val = 0;
        this.next = null;
    }

    public int getVal() {
        return val;
    }

    private boolean isEmpty = true;


    ListNode(int val, ListNode next) {
        this.val = val;
        isEmpty = false;
        this.next = next;
    }

    @Override
    public String toString() {
        if (isEmpty) {
            return "[]";
        }
        StringBuilder list = new StringBuilder("[");
        ListNode current = this;

        while (current != null) {
            list.append(current.val);
            current = current.next;
            if (current != null) {
                list.append(",");
            }
        }
        list.append("]");
        return list.toString();
    }
}
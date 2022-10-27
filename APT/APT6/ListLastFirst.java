public class ListLastFirst {
    public ListNode move(ListNode list) {
        if (list == null) {
            return null;
        }
        if (list.next == null) {
            return list;
        }
        ListNode root = list;
        while (root.next.next != null) {
            root = root.next;
        }
        ListNode start =  root.next;
        root.next = null;
        start.next = list;
        return start;
    }
}

import java.util.ArrayList;

public class DoubleList {
    public ListNode bigify(ListNode list){
        int amount = 2;
        if (list == null) {
            return null;
        }
        ArrayList<Integer> ll = new ArrayList<>();
        ListNode root = list;
        while (root.next != null){
            for (int i = 0; i < amount; i++) {
                ll.add(root.info);
            }
            root = root.next;
        }
        for (int i = 0; i < amount; i++) {
            ll.add(root.info);
        }
        ListNode start = new ListNode(ll.get(0));
        ListNode og_start = start;
        for (int itera = 1; itera < ll.size(); itera++) {
            start.next = new ListNode(ll.get(itera));
            start = start.next;
        }
        return og_start;
    }
}


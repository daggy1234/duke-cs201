import java.util.ArrayList;
import java.util.List;

public class RemoveMin {
    public ListNode remove (ListNode list) {
        if (list == null) {
            return null;
        }
        ListNode root = list;
        List<Integer> ll = new ArrayList<>();
        int min = 999999999;
        while (root.next != null){
            if (root.info < min) {
                min = root.info;
            }
            ll.add(root.info);
            root = root.next;
        }
        if (root.info < min) {
            min = root.info;
        }
        ll.add(root.info);
        if (ll.size() == 1) {
            return null;
        }
        int iterst = 1;
        ListNode start = new ListNode(ll.get(0));
        if (ll.get(0) == min) {
            start = new ListNode(ll.get(1));
            iterst = 2;
        }
        ListNode og_start = start;
        for (int itera = iterst; itera < ll.size(); itera++) {
            if (ll.get(itera) != min) {
                start.next = new ListNode(ll.get(itera));
                start = start.next;
            }
        }
        return og_start;
    }

//    public static void main(String[] args) {
//        RemoveMin rm = new RemoveMin();
//
//        rm.remove()
//    }
}

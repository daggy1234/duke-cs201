import java.util.ArrayList;
import java.util.List;

public class ListsEqual {

    public List<Integer> LLtoL(ListNode root) {
        ArrayList<Integer> ll = new ArrayList<>();
        if (root == null) {
            return ll;
        }
        while (root.next != null){
            ll.add(root.info);
            root = root.next;
        }
        ll.add(root.info);
        return ll;
    }

    public int equal(ListNode a1, ListNode a2) {
        ListsEqual le = new ListsEqual();
        List<Integer> ll_a = le.LLtoL(a1);
        List<Integer> ll_b = le.LLtoL(a2);
        if (ll_a.equals(ll_b)) {
            return 1;
        }
        return 0;
    }

//    public static void main(String[] args){
//        ListsEqual le = new ListsEqual();
//
//    }
}

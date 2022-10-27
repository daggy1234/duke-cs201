import java.util.*;

public class AlphaLength {

    public ListNode create (String[] words) {
        List<String> unique_w =  Arrays.asList(words);
        List<String> hs =  new ArrayList<>(new HashSet<String>(unique_w));
        Collections.sort(hs);
        ListNode root = new ListNode(hs.get(0).length());
        ListNode iter = root;
        for (int i  = 1; i < hs.size(); i++) {
            String word = hs.get(i);
            System.out.println(word);
            iter.next = new ListNode(word.length());
            iter = iter.next;
        }
        return root;
    }

    public void printLL(ListNode root) {
        ArrayList<Integer> ll = new ArrayList<>();
        while (root.next != null){
            ll.add(root.info);
            root = root.next;
        }
        ll.add(root.info);
        System.out.println(ll);
    }

//    public static void main(String[] args) {
////        String[] words = {"bat", "at", "spat", "expat"};
//        String[] words = {"help", "help", "what", "what", "can", "be", "bee", "done"};
//        AlphaLength al = new AlphaLength();
//        ListNode o = al.create(words);
//        al.printLL(o);
//    }
}

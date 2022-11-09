import java.util.*;

public class LeafCollector {

    HashMap<Integer, ArrayList<String>> v;
    public String[] trail_obj(TreeNode tree,int ct) {
        if (tree == null) {
           return new String[0];
        }
        if (tree.left == null && tree.right == null) {
            if (!v.containsKey(ct)) {
                ArrayList<String> al = new ArrayList<>();
                al.add((String.valueOf(tree.info)));
                v.put(ct, al);
            } else {
                ArrayList<String> al = v.get(ct);
                al.add((String.valueOf(tree.info)));
                v.put(ct, al);
            }
        }
        trail_obj(tree.left,ct+1);
        trail_obj( tree.right, ct+1);
        return new String[0];

    }

    public String[] getLeaves(TreeNode tree) {
        v = new HashMap<>();
        String[] out = trail_obj(tree, 0);
        Object[] arr = v.keySet().toArray();
        Arrays.sort(arr, Collections.reverseOrder());
        for (Object o: arr) {
            System.out.println(v.get(o));
        }
       return out;
    }

    public static void main(String[] agrs) {
        TreeNode n = new TreeNode(8);
        n.left = new TreeNode(4);
        n.left.right = new TreeNode(6);
        n.right = new TreeNode(12);
        n.right.left = new TreeNode(10);
        n.right.right = new TreeNode(15);
        LeafCollector lc = new LeafCollector();
        System.out.println(Arrays.toString(lc.getLeaves(n)));

    }
}

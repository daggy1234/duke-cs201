import java.util.*;

public class LeafTrails {

    HashMap<Integer, String> v;

    public String[] trail_obj(String param, TreeNode tree) {
        if (tree == null) {
            String[] arr = {};
            return arr;
        }
        if (tree.left == null && tree.right == null) {
            v.put(tree.info, param);
            String[] a = {param};
            return a;
        }
        ArrayList<String> lpro = new ArrayList<>(Arrays.asList(trail_obj(param + "0", tree.left)));
        ArrayList<String> rpro =  new ArrayList<>(Arrays.asList(trail_obj(param + "1", tree.right)));
        lpro.addAll(rpro);
        return lpro.toArray(new String[lpro.size()]);

    }

    public String[] trails(TreeNode tree) {
        v = new HashMap<>();
        String[] out = trail_obj("", tree);
        Object[] arr =  v.keySet().toArray();
        Arrays.sort(arr);
        String[] retarr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
             retarr[i] = v.get(arr[i]);
        }
        return retarr;

    }

//    public static void main(String[] args) {
//        TreeNode n = new TreeNode(3);
//        n.left = new TreeNode(72);
//        n.left.left = new TreeNode(68);
//        n.left.right = new TreeNode(85);
//        n.right = new TreeNode(8);
//        n.right.left = new TreeNode(77);
//        n.right.left.left = new TreeNode(75);
//        n.right.left.right = new TreeNode(69);
//        LeafTrails lt = new LeafTrails();
//        System.out.println( Arrays.toString(lt.trails(n)));
//    }
}

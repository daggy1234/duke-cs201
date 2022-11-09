import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AllPaths {


    public String[] trail_obj(String param, TreeNode tree) {
        if (tree == null) {
            String[] arr = {};
            return arr;
        }
        if (tree.left == null && tree.right == null) {
            String sum = param +String.valueOf(tree.info);
            String[] a = {sum};
            return a;
        }
        ArrayList<String> lpro = new ArrayList<>(Arrays.asList(trail_obj(param + String.valueOf(tree.info)+"->", tree.left)));
        ArrayList<String> rpro =  new ArrayList<>(Arrays.asList(trail_obj(param + String.valueOf(tree.info)+"->", tree.right)));
        lpro.addAll(rpro);
        return lpro.toArray(new String[lpro.size()]);

    }

    public String[] paths(TreeNode tree) {
        String[] out = trail_obj("", tree);
        Arrays.sort(out);
//        String[] to_ret = new String[out.length];
//        for (int j = 0; j < out.length; j++) {
//            String o = out[j];
//            StringBuilder builder = new StringBuilder();
//            for (int i = 0; i < o.length()-1; i++) {
//                builder.append(o.charAt(i));
//                builder.append('-');
//                builder.append('>');
//            }
//            builder.append(o.charAt(o.length() -1 ));
//            to_ret[j] = builder.toString();
//        }

        return out;

    }

//    public static void main(String[] args) {
//        TreeNode n = new TreeNode(5);
//        n.left = new TreeNode(3);
//        n.right = new TreeNode(2);
//        n.right.right = new TreeNode(6);
//        n.left.left = new TreeNode(8);
//        n.left.right = new TreeNode(4);
//        n.left.right.left = new TreeNode(7);
//        n.left.right.right = new TreeNode(1);
//        AllPaths ap = new AllPaths();
//        System.out.println(Arrays.toString(ap.paths( n)));
//    }

}

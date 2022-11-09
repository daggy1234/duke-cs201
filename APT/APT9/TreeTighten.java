public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if (t == null) {
            return t;
        }
        if (t.left == null && t.right != null) {
            return tighten(t.right);
        }
        if (t.right == null && t.left != null) {
            return tighten(t.left);
        }
        t.left = tighten(t.left);
        t.right = tighten(t.right);
        return t;
    }


}

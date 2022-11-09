public class HeightLabel {

    public TreeNode rewire(TreeNode t) {
        TreeNode left,right;
        return (t == null) ?  t : new TreeNode((Math.max((((left = rewire(t.left)) == null) ? 0 : left.info),((right = rewire(t.right)) == null) ? 0 :right.info) + 1), left, right);
    }
}
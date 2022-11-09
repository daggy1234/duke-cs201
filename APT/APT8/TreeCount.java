public class TreeCount {
    public int count(TreeNode tree) {
        return tree == null ?  0 : (count(tree.left) + count(tree.right) + 1);
    }
}

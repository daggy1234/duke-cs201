public class PathSum {
    public int hasPath(int target, TreeNode tree){
        return tree == null ? 0 : ((tree.info == target) ? 1 : ((hasPath(target-tree.info, tree.left) == 1 || hasPath(target - tree.info, tree.right) == 1) ? 1 : 0));
    }
}

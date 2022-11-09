import java.util.ArrayList;
import java.util.Arrays;

public class SortedLeaves {
    public String[] values(TreeNode tree) {
        String[] arr;
        if (tree == null) {
            return new String[0];
        } else {
            if (tree.left == null && tree.right == null) {
                return arr = new String[]{(Character.toString((char) tree.info))};
            } else {
                arr = new ArrayList<String>() {{
                    addAll(Arrays.asList(values(tree.left)));
                    addAll(Arrays.asList(values(tree.right)));
                }}.toArray(new String[0]);
                Arrays.sort(arr);
                return arr;
            }
        }
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        if (root == null) {
            return new int [0];
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(root.info);
        int[] arr_l = unique(root.left);
        List<Integer> arrl_l = Arrays.stream(arr_l).boxed().collect(Collectors.toList());
        arr.addAll(arrl_l);
        int[] arr_r = unique(root.right);
        List<Integer> arrl_r = Arrays.stream(arr_r).boxed().collect(Collectors.toList());
        arr.addAll(arrl_r);
        ArrayList<Integer> hs = new ArrayList<>(new HashSet<>(arr));
        Collections.sort(hs);
        return hs.stream().mapToInt(Integer::intValue).toArray();
    }
}

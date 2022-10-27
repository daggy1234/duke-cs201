import java.util.ArrayList;
import java.util.List;

public class PairDown {
    public int[] fold(int[] list) {
        List<Integer> retl = new ArrayList<>();
        for (int i = 0; i < (list.length - 1); i+=2) {
            int v = list[i] + list[i+1];
            retl.add(v);
        }
        if ((list.length % 2) != 0) {
            retl.add(list[list.length-1]);
        }
        System.out.println(retl);
        int[] l = retl.stream().mapToInt(Integer::intValue).toArray();
        return l;
    }

    public static void main(String[] args) {
        PairDown pd = new PairDown();
        int[] a = {1,2,3};
        pd.fold(a);
    }

}

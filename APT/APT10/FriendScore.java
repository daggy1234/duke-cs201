import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FriendScore {
    public int highestScore(String[] friends) {
        int iters = friends.length;
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < iters; i++) {
            for (int j = 0; j < iters; j++) {
                String fmt = String.format("(%d,%d)", i, j);
                String fmtb = String.format("(%d,%d)", j, i);
                if (i != j)  {
                    char i_char = friends[i].charAt(j);
                    char j_char = friends[j].charAt(i);
                    if (i_char == 'Y' && j_char == 'Y') {
                        if (hm.containsKey(i)) {
                            HashSet<Integer> a = hm.get(i);
                            a.add(j);
                            hm.put(i, a);
                        } else {
                            HashSet<Integer> a = new HashSet<>();
                            a.add(j);
                            hm.put(i,a);
                        }

                    }
                    hs.add(fmt);
                    hs.add(fmtb);
                }
            }
        }
        Set<Integer> ks = hm.keySet();
        int max_v = 0;
        for (int k: ks) {
            HashSet<Integer> ths = new HashSet<>();
            HashSet<Integer> frnds = hm.get(k);
            ths.addAll(frnds);
            for (int elm: frnds) {
                HashSet<Integer> val = hm.get(elm);
                ths.addAll(val);
            }
            ths.remove(k);
            if (ths.size() > max_v) {
                max_v = ths.size();
            }
        }
        return max_v;
    }

//    public static void main(String[] bargs) {
//        String[] args = {"NYNNN",
//                "YNYNN",
//                "NYNYN",
//                "NNYNY",
//                "NNNYN"};
//        FriendScore fs = new FriendScore();
//        System.out.println(fs.highestScore(args));
//    }
}

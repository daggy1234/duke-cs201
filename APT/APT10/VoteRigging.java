import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VoteRigging {
    public int minimumVotes(int[] votes) {
        if (votes.length == 1) return 0;
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i < votes.length; i++) {
            a.add(votes[i]);
        }
        int vc = votes[0];
        int ctr = 0;
        while (true) {
            System.out.println(a);
            if (vc > Collections.max(a)) {
                break;
            }
            Collections.sort(a, Collections.reverseOrder());
            a.set(0, a.get(0) - 1);
            vc++;
            ctr++;
        }
        return ctr;
    }

//    public static void main(String[] args) {
//        VoteRigging vr = new VoteRigging();
//        int[] votes = {5, 10, 7, 3, 8};
//        System.out.println(vr.minimumVotes(votes));
//    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class MemberCheck {
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3) {
        List<String> c1 = Arrays.asList(club1);
        List<String> c2 = Arrays.asList(club2);
        List<String> c3 = Arrays.asList(club3);
        int ms = Math.max(c3.size(), Math.max(c2.size(), c1.size()));
        List<String> ls = new ArrayList<String>();
        for (int i = 0; i < ms; i++) {
            if (i < c1.size()) {
                String c1n = c1.get(i);
                if (c3.contains(c1n) || c2.contains(c1n)) {
                    ls.add(c1n);
                }
            }
            if (i < c2.size()) {
                String c2n = c2.get(i);
                if (c3.contains(c2n) || c1.contains(c2n)) {
                    ls.add(c2n);
                }
            }
            if (i < c3.size()) {
                String c3n = c3.get(i);
                if (c2.contains(c3n) || c1.contains(c3n)) {
                    ls.add(c3n);
                }
            }
        }
        Set<String> foo = new HashSet<String>(ls);
        List<String> foosort =  new ArrayList<String>(foo);
        Collections.sort(foosort);
        return foosort.toArray(new String[foosort.size()]);
    }
}

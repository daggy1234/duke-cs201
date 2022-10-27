import java.util.HashMap;
import java.util.HashSet;

public class Translate {
    public int numAlternates(String original, String translated) {
        String[] org_spli = original.split(" ");
        String[] trans_spli = translated.split(" ");
        HashMap<String, HashSet<String>> hm = new HashMap<>();
        int alt_trabs = 0;
        for (int i = 0; i < org_spli.length; i++) {
            if (hm.containsKey(org_spli[i])) {
                HashSet<String> hs = hm.get(org_spli[i]);
                System.out.println(hs);
                if (!hs.contains(trans_spli[i])) {
                    System.out.println(trans_spli[i]);
                    hs.add(trans_spli[i]);
                    if (hs.size() <= 2) {
                        alt_trabs += 2;
                    } else {
                        alt_trabs++;
                    }
                }
            } else {
                HashSet<String> hsa = new HashSet<>();
                hsa.add(trans_spli[i]);
                hm.put(org_spli[i], hsa);
            }
        }
        return alt_trabs;
    }

    public static void main(String[] arg) {
        Translate tl = new Translate();
        tl.numAlternates("ta ta ta ba ba ka", "foo bar zip foo bar foo");
    }
}
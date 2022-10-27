import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;



class FrequencyComparatorB implements Comparator<String> {

    private HashMap<String, Integer> internalhm;

    FrequencyComparatorB(HashMap<String, Integer> a) {
        internalhm = a;
    }

    @Override
    public int compare(String a, String b) {
        int frcomp = internalhm.get(b).compareTo(internalhm.get(a));
        if (frcomp == 0) {
            return a.compareTo(b);
        } else {
            return  frcomp;
        }
    }
}

public class SortedFreqs {

        public int[] freqs(String[] data) {
            HashMap<String,Integer> hm = new HashMap<>();
            ArrayList<String> al = new ArrayList<>();
            for (String elm: data) {
                int count = hm.getOrDefault(elm, 0);
                hm.put(elm, count + 1);
                if (!al.contains(elm)) {
                    al.add(elm);
                }
            }
            System.out.println(al);
            Collections.sort(al);
            int[] arr = new int[al.size()];
            for (int i = 0; i < al.size(); i++) {
                arr[i] = hm.get(al.get(i));
            }
            return arr;
        }
}

import java.util.*;

class FrequencyComparator implements Comparator<String> {

    private HashMap<String, Integer> internalhm;

    FrequencyComparator(HashMap<String, Integer> a) {
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

public class SortByFreqs {
    public String[] sort(String[] data) {
        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        for (String elm: data) {
            int count = hm.getOrDefault(elm, 0);
            hm.put(elm, count + 1);
            if (!al.contains(elm)) {
                al.add(elm);
            }
        }
        FrequencyComparatorB fq = new FrequencyComparatorB(hm);
        Collections.sort(al, fq);
        return al.toArray(new String[al.size()]);
    }
}

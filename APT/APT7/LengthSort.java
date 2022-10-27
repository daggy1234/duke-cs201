import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



class LengthComparator implements Comparator<String> {
    LengthComparator() {
        System.out.println("Help");
    }

    @Override
    public int compare(String a, String b) {
        if (a.length() > b.length()) {
            return 1;
        } else if (a.length() < b.length()) {
            return -1;
        } else {
           return a.compareTo(b);
        }
    }
}

public class LengthSort {
    public String[] rearrange(String[] values){
        List<String> l = Arrays.asList(values);
        LengthComparator ls = new LengthComparator();
        l.sort(ls);
        return l.toArray(new String[l.size()]);
    }
}

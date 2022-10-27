import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thesaurus {

    public List<String> merge(List<String> a, List<String> b) {
        System.out.println(a);
        System.out.println(b);
        b.retainAll(a);
        return a;
    }

    public String[] edit(String[] entry) {
        List<List<String>> tes_l = new ArrayList<>();
        for (String entr: entry) {
            tes_l.add(Arrays.asList(entr.split(" ")));
        }
        merge(tes_l.get(0), tes_l.get(2));
        return new String[1];
    }

    public static void main(String[] args){
        Thesaurus th = new Thesaurus();
        String[] a = {"ape monkey wrench", "wrench twist strain", "monkey twist frugue"};
        th.edit(a);
    }
}

import java.util.*;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        List<String> ana_has = new ArrayList<>();
        List<String> to_ret = new ArrayList<>();
        for (String phrase: phrases) {
            char[] phrase_arr = phrase.toLowerCase().replaceAll("\\s", "").toCharArray();
            Arrays.sort(phrase_arr);
            String phracheck = String.valueOf(phrase_arr);
            if (!ana_has.contains(phracheck)) {
                to_ret.add(phrase);
                ana_has.add(phracheck);
            }
        }
        return to_ret.toArray(new String[to_ret.size()]);
    }

//    public static void main(String[] args) {
//        String[] phrases = { "Aaagmnrs", "TopCoder", "anagrams", "Drop Cote" };
//        Anagrams ana = new Anagrams();
//        System.out.println(Arrays.toString(ana.anagrams(phrases)));
//    }
}

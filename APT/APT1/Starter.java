import java.util.HashSet;

public class Starter {
    public int begins(String[] words, String first) {
        HashSet<String> set = new HashSet<>();
        for (String word: words) {
            if (word.startsWith(first)) {
                set.add(word);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        Starter obj = new Starter();
        String[] words = {"hello", "world"};
        String first = "hello";
        System.out.println(obj.begins(words, first));
    }
}

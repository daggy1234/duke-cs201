import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class BigWord {

    BigWord() {
        System.out.println("BigWord()");
    }

    public String most(String[] sentences) {
        List<String> words = new ArrayList<String>();
        for (String s : sentences) {
            String[] wordsInSentence = s.split(" ");
            for (String w : wordsInSentence) {
                words.add(w.toLowerCase());
            }
        }
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        for (String w : words) {
            if (wordCount.containsKey(w)) {
                wordCount.put(w, wordCount.get(w) + 1);
            } else {
                wordCount.put(w, 1);
            }
        }
        String most = "";
        int mostCount = 0;
        Iterator<Map.Entry<String, Integer>> it = wordCount.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>)it.next();
            if ((int)pair.getValue() > mostCount) {
                most = (String)pair.getKey();
                mostCount = (int)pair.getValue();
            }
        }
        return most;
    }

    public static void main(String[] args) {
        BigWord bw = new BigWord();
        String[] sentences = {"big bad dog", "big bad toy", "big bad cat", "small bad cat"};
        System.out.println(bw.most(sentences));
    }
}

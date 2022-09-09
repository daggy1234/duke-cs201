import java.util.List;
import java.util.ArrayList;


public class TxMsg {

    // TxMsg() {
    //     System.out.println("made txmsg");
    // }

    
    public boolean AllVowels(String a) {
        char[] charList = a.toCharArray();
        List<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (Character c : charList) {
            if (!vowels.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public String abConString(String phrase) {
        char[] charArray = phrase.toCharArray();
        List<Character> charList = new ArrayList<Character>();
        List<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        if (!vowels.contains(charArray[0])) {
            charList.add(charArray[0]);
        }
        for (int i = 1; i < charArray.length; i++) {
            if (!vowels.contains(charArray[i]) && vowels.contains(charArray[i - 1])) {
                charList.add(charArray[i]);
            }
            }
        StringBuilder sb = new StringBuilder();
        for (Character ch: charList) {
            sb.append(ch);
        }
        return sb.toString();
        }
            


    public String getMessage(String original) {
        TxMsg txmsg = new TxMsg();
        List<String> words = new ArrayList<String>();
        String[] splitSL = original.split("\\W+");
        for (String phrase : splitSL) {
            if (txmsg.AllVowels(phrase)) {
                words.add(phrase);
            } else {
                words.add(txmsg.abConString(phrase));
            }
        }
        return String.join(" ", words);
      }

    //   public static void main(String[] args) {
    //     String phrase = "aeiou bcdfghjklmnpqrstvwxyz";
    //     TxMsg txmsg = new TxMsg();
    //     System.out.println(txmsg.getMessage(phrase));
    //   }
}

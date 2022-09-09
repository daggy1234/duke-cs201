import java.util.ArrayList;
import java.util.List;

public class Common {


    // Common() {
    //     System.out.println("made common");
    // }

    public List<Character> StringtoCharList(String a) {
        List<Character> charList = new ArrayList<Character>();
        char[] charArray = a.toCharArray();
        for (char c : charArray) {
            charList.add(c);
        }
        return charList;
    }

    public int count(String a, String b) {
        Common cmn = new Common();
        List<Character> charList = cmn.StringtoCharList(a);
        List<Character> charListB = cmn.StringtoCharList(b);
        List<Character> mutualList = new ArrayList<Character>();
        for (Character c : charList) {
            if (charListB.contains(c)) {
                int ind = charListB.indexOf(c);
                charListB.remove(ind);
                mutualList.add(c);
            }
        }
        System.out.println(mutualList);
        return mutualList.size();


    }

    // public static void main(String[] args) {
    //     Common c = new Common();
    //     String a = "horse";
    //     String b =  "mirth";
    //     System.out.println(c.count(a,b));
    // }
}

// package APT.APT2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Common {


    // Common() {
    //     System.out.println("made common");
    // }

    public Set<Character> StringtoSet(String a) {
        char[] charArray = a.toCharArray();
        Set<Character> unique = new HashSet<Character>();
        for(char c : charArray) {
            unique.add(c);
        }
        return unique;

    }

    public int count(String a, String b) {
        Common cmn = new Common();
        Set<Character> set_a = cmn.StringtoSet(a);
        Set<Character> set_b = cmn.StringtoSet(b);
        set_a.retainAll(set_b);
        return set_a.size();

    }

    // public static void main(String[] args) {
    //     Common c = new Common();
    //     String a = "horse";
    //     String b =  "moose";
    //     System.out.println(c.count(a,b));
    // }
}

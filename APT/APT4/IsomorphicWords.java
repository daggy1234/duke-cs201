import java.util.*;


public class IsomorphicWords {

    public List<Character> charList(String p) {
        List<Character> ch = new ArrayList<>();
        for (char c : p.toCharArray()) {
            ch.add(c);
        }
        return ch;
    }

    public boolean isIsomorphic(String parama, String paramb) {
        List<Character> param_a = charList(parama);
        List<Character> param_b = charList(paramb);
        for (int i = 0; i < param_a.size(); i++) {
            Character cha = param_a.get(i);
            Character chb = param_b.get(i);
            if (Collections.frequency(param_a, cha) != Collections.frequency(param_b, chb)) {
                return false;
            }
        }
        return true;
    }

    public int countPairs(String[] words) {
        List<List<String>> plist = new ArrayList<>();
        for (String p : words) {
            for (String subp : words) {
                if (isIsomorphic(p, subp) && !p.equals(subp)) {
                    List<String> newarr = new ArrayList<>();
                    newarr.add(p);
                    newarr.add(subp);
                    Collections.sort(newarr);
                    if (!plist.contains(newarr)) {
                        plist.add(newarr);
                    }
                }
            }
        }
        System.out.println(plist);
        return plist.size();
    }

    public static  void main(String[] args) {
        String[] arr = {"aab", "abb", "cdd", "ccd"};
        IsomorphicWords isow = new IsomorphicWords();
//        System.out.println(isow.isIsomorphic("abca", "zbxz"));
        System.out.println(isow.countPairs(arr));
    }
}
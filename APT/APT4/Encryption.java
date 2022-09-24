import java.util.*;

public class Encryption {

    public String encrypt(String message){
        List<Character> chl = new ArrayList<Character>();
        HashMap<Character, Character> hm = new HashMap<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
         for (Character ch: message.toCharArray()) {
             chl.add(ch);
         }
         int indx = 0;
         for (int i = 0; i < chl.size(); i++) {
             Character tc = chl.get(i);
             Character toc = hm.get(tc);
             if (toc == null) {
                 hm.put(tc, alphabet[indx]);
                 indx++;
             }
         }
        StringBuilder sb = new StringBuilder();
         for (Character ch: chl) {
             sb.append(hm.get(ch));
         }
         return sb.toString();

    }

    public static void main(String[] args) {
        Encryption e = new Encryption();
        System.out.println(e.encrypt("hello"));
    }
}

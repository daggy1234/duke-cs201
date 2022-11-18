import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HuffmanDecoding {

    public String decode(String archive, String[] dictionary) {
        HashMap<String, Character> kv = new HashMap<>();
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < dictionary.length; i++) {
            kv.put(dictionary[i], arr[i]);
        }
        HuffmanDecoding hd = new HuffmanDecoding();
        String to_mutate = archive;
        StringBuilder sb = new StringBuilder();
//        System.out.println(kv);
//        System.out.println(to_mutate);
        int ctr = 0;
        while (true) {
            if (to_mutate.length() < 1) {
                break;
            }
            for (int j = 0; j < to_mutate.length(); j++) {
                String sub = to_mutate.substring(0,j+1);
//                System.out.println(to_mutate);
//                System.out.println(sub);
                if (kv.containsKey(sub)) {
                    System.out.println(kv.get(sub));
                    sb.append(kv.get(sub));
                    to_mutate = to_mutate.substring(j+1, to_mutate.length());
                }
            }
            ctr++;
        }
        return sb.toString().toUpperCase();
    }

//    public static void main(String[] args) {
//        String[] dict = {"0","111","10"};
//        String to_dec = "10111010";
//        HuffmanDecoding hf = new HuffmanDecoding();
//        System.out.println(hf.decode(to_dec, dict));
//    }
}

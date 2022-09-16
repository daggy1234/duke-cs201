public class PrefixCode {

    PrefixCode() {
        System.out.println("PrefixCode()");
    }

    public String isOne(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (String word: words) {
                if (word.startsWith(words[i]) && !word.equals(words[i])) {
                    return "No, " + i;
            }
        }
    }
        return "Yes";
    }

    public static void main(String[] args) {
        String[] words = {"10001", "011", "100", "001", "10"};
        PrefixCode pc = new PrefixCode();
        System.out.println(pc.isOne(words));
    }
}

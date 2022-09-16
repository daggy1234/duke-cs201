import java.util.Arrays;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] chararr = str.split(" ");
        int[] countsArr = new int[words.length];
        for (int maini = 0; maini < words.length; maini++) {
            int count = 0;
            for (int i = 0; i < chararr.length; i++) {
                String w = words[maini];
                if (chararr[i].equals(w)) {
                    count++;
                }
            }
            countsArr[maini] = count;
        }
        System.out.println(countsArr);
        return countsArr;
    }

    public static void main(String[] args) {
        CounterAttack ca = new CounterAttack();
        String str = "one two one two one two vorpal blade";
        String[] words = {"snicker", "one", "blade", "runner"};
        System.out.println(Arrays.toString(ca.analyze(str, words)));
    }
}

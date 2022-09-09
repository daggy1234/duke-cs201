package APT.APT2;
import java.util.Arrays;
import java.util.List;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        List<String> availableList = Arrays.asList(available);
        for (int i = 0; i < orders.length; i++) {
            String order = orders[i];
            String[] splitStr = order.split("\\s+");
            boolean found = true;
            for (String item: splitStr){
                if (!availableList.contains(item)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            };
        }
        return -1; 
     }

     public static void main(String[] args) {
        SandwichBar bar = new SandwichBar();
        String[] available = { "foo", "bar", "baz", "gazonk", "quux", "bat", "xyzzy", "shme", "hukarz", "grault", "waldo", "bleh" };
        String[] orders = { "kalatehas", "spam eggs", "needle haystack", "bleh blarg", "plugh", 
        "the best sandwich in the universe"};
        System.out.println(bar.whichOrder(available, orders));
     }
}

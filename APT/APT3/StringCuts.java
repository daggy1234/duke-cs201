import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StringCuts {
    public String[] filterCool(String[] list, int minLength) {
        return Arrays.asList(list).stream().filter(s -> s.length() >= minLength).toArray(String[]::new);
    }

    public String[] filter(String[] list, int minLength) {
        List<String> newList = new ArrayList<String>();
        for (String s : list) {
            if ((s.length() >= minLength) && (!newList.contains(s))) {
                newList.add(s);
            }
        }
        
        return newList.toArray(new String[newList.size()]);
    }

    public static void main(String[] args) {
        StringCuts sc = new StringCuts();
        String[] list = {"huge", "enormous", "big", "gigantic", "enormous"};
        System.out.println(Arrays.toString(sc.filterCool(list, 5)));
    }

}

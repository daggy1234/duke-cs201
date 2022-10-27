import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LunchPlans {
    public String[] favorites(String[] preferences) {
        String[] pref_a = preferences[0].split(" ");
        ArrayList<String> prefs = new ArrayList<>();
        for (String pref: pref_a) {
            boolean all_pass = true;
            for (int i = 1; i < preferences.length; i++) {
                List<String> a =  Arrays.asList(preferences[i].split(" "));
                if (!a.contains(pref)) {
                    all_pass = false;
                }
            }
            if (all_pass) {
                prefs.add(pref);
            }
        }
        return prefs.toArray(new String[prefs.size()]);
    }
}
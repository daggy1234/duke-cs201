import java.util.*;

public class SetAside {
    public String common(String[] list) {
        List<List<String>> hs = new ArrayList<List<String>>();
        List<String> nhsti = new ArrayList<>();
        int mins = 99999999;
        for (String st: list) {
            String[] splili = st.split(" ");
            List<String> nhs = Arrays.asList(splili);
            if (nhs.size() < mins) {
                nhsti = nhs;
            }
            hs.add(nhs);
        }
        List<String> elmlis = new ArrayList<>();
        for (String elm: nhsti) {
            boolean found = true;
            for (List<String> has: hs) {
                if (!has.contains(elm)) {
                    found = false;
                }
            }
            if (found) {
                elmlis.add(elm);
            }
        }
        List<String> rkfor =  new ArrayList<String>(new HashSet<>(elmlis));
        Collections.sort(rkfor);

        return String.join(" ", rkfor);
    }

    //    public static void main(String[] args) {
    //        String[] la = {"blue blue water", "blue skies are blue", "blue is blue"};
    //        SetAside sa = new SetAside();
    //        System.out.println(sa.common(la));
    //    }
}

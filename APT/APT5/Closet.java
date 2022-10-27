import java.util.*;

public class Closet {
    public String common(String[] list) {
        HashSet<String> nhsti = new HashSet<>();
        for (String st: list)  {
            String[] splili = st.split(" ");
            List<String> nhs = Arrays.asList(splili);
            nhsti.addAll(nhs);
        }
        List<String> la = new ArrayList<>(nhsti);
        Collections.sort(la);
        return String.join(" ", la);
    }

        public static void main(String[] args) {
            String[] la = {"a b c d", "b c d", "b c d e", "b c f"};
            Closet csa = new Closet();
            System.out.println(csa.common(la));
        }
}

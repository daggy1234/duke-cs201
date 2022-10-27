import java.util.*;

class MedalCountry {
    String myName;
    int myGold;
    int mySliver;
    int myBronze;

    MedalCountry(String name) {
        myName = name;
    }

    public int getGold() {
        return myGold;
    }

    public int getSilver() {
        return mySliver;
    }

    public int getBronze() {
        return myBronze;
    }

    public String getName() {
        return myName;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d", myName, myGold, mySliver, myBronze);
    }

}


public class MedalTable {
    public String[] generate(String[] results) {
        Map<String, MedalCountry> map = new HashMap<>();
        for (String s: results) {
            String[] data = s.split(" ");
            for (int i = 0; i < data.length; i++) {
                String c = data[i];
                if(!map.containsKey(c)) {
                    map.put(c, new MedalCountry(c));
                }
                if (i == 0) {
                    map.get(c).myGold += 1;
                } else if (i == 1) {
                    map.get(c).mySliver += 1;
                } else {
                    map.get(c).myBronze += 1;
                }
            }
        }
        ArrayList<MedalCountry> list = new ArrayList<>(map.values());
        Comparator<MedalCountry> gold = Comparator.comparing(MedalCountry::getGold).reversed();
        Comparator<MedalCountry> silver = Comparator.comparing(MedalCountry::getSilver).reversed();
        Comparator<MedalCountry> bronze = Comparator.comparing(MedalCountry::getBronze).reversed();
        Comparator<MedalCountry> name = Comparator.comparing(MedalCountry::getName);
        Comparator<MedalCountry> comp = gold.thenComparing(silver).thenComparing(bronze).thenComparing(name);
        Collections.sort(list, comp);
        String[] toret = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            toret[j] = list.get(j).toString();
        }
        return toret;
    }

//    public static void main(String[] args) {
//        String[] v = {"GER AUT SUI", "AUT SUI GER", "SUI GER AUT"};
//        MedalTable mt = new MedalTable();
//        mt.generate(v);
//    }

}

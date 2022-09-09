package APT.APT2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class SimpleWordGame {

    SimpleWordGame() {
        System.out.println("made simplewordgame");
    }

    public int points(String[] player, String[] dictionary) {
        Set<String> set = new HashSet<String>(); 
        int score = 0;
        List<String> list = Arrays.asList(dictionary);
        for (String pl: player) {
            if (!set.contains(pl)) {
                if (list.contains(pl)) {
                    score += (pl.length() * pl.length());
                    set.add(pl);
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        SimpleWordGame swg = new SimpleWordGame();
        String[] player = { "apple" };
        String[] dictionary = { "strawberry", "orange", "grapefruit", "watermelon" };
        System.out.println(swg.points(player, dictionary));
    }
}

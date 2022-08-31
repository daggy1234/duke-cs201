import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scannerObject = new Scanner(new File("data/lorum.txt"));
        List<String> iteratedWords = new ArrayList<>();
        int numWords = 0;
        while (scannerObject.hasNext()) {
            String word = scannerObject.next();
            if (!iteratedWords.contains(word)) {
                iteratedWords.add(word);
                numWords++;
            };
        };
        System.out.println("Number of words: " + numWords);

    }
}

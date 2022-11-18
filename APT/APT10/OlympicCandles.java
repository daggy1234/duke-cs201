import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OlympicCandles {

    public List<Integer> dropzeros(List<Integer> candles) {
        ArrayList<Integer> al = new ArrayList<>();
        for (Integer candle: candles) {
            if (candle > 0) {
                al.add(candle);
            }
        }
        Collections.sort(al, Collections.reverseOrder());
        return al;
    }

    public int numberOfNights(int[] candles){
        List<Integer> candlell = new ArrayList<>();
        for (int candle: candles) {
            candlell.add(candle);
        }
        Collections.sort(candlell, Collections.reverseOrder());
        int days = 0;
        int candle_n = 1;
        OlympicCandles oc = new OlympicCandles();
        while (true) {
//            System.out.println(candlell);
            if (candle_n > candlell.size()) {
                break;
            }
            for (int j = 0; j < candle_n; j++) {
                candlell.set(j, candlell.get(j) - 1);
            }
            candlell = oc.dropzeros(candlell);
            days++;
            candle_n++;
        }
        return days;
    }

//    public static void main(String[] args) {
//        int[] candles = {2, 2, 2};
//        OlympicCandles oc = new OlympicCandles();
//        System.out.println(oc.numberOfNights(candles));
//    }
}

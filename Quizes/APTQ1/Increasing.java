import java.util.ArrayList;

public class Increasing {
    public int[] getIncreasing(int[] numbers) {
        int start_nu = numbers[0];
        ArrayList<Integer> al = new ArrayList<>();
        al.add(start_nu);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > start_nu) {
                al.add(numbers[i]);
                start_nu = numbers[i];
            }
        }
        int[] to_ret = new int[al.size()];
        for (int j = 0; j < al.size(); j++) {
            to_ret[j] = al.get(j);
        }
        return to_ret;
    }

}

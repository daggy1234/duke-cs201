public class Totality {

    Totality() {
        System.out.println("made totality");
    }

    public int sum(int[] a, String stype) {
        if (stype.equals("odd")) {
            int max_sum = 0;
            for (int i = 1; i<a.length; i+= 2) {
                max_sum += (a[i]);
            }
            return max_sum;
        } else if (stype.equals("even")) {
            int max_sum = 0;
            for (int i = 0; i<a.length; i+= 2) {
                max_sum += (a[i]);
            }
            return max_sum;
        } else {
            int max_sum = 0;
            for (int i = 0; i<a.length; i+= 1) {
                max_sum += (a[i]);
            }
            return max_sum;
        }
    }

    public static void main(String[] inp) {
        int[] a = {22,23};
        String stype;
        stype = "even";
        Totality obj = new Totality();
        System.out.println(obj.sum(a, stype));
        
    }
}

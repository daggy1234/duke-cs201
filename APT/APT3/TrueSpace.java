package APT.APT3;

public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long total = 0;
        for (int size: sizes) {
            long out =  (long) Math.ceil((double) size / clusterSize);
            if (out == 0 && size != 0) {
                total += clusterSize;
            } else {
                total += (out * clusterSize);
            }
        };
        return total;
    }

    public static void main(String[] args) {
        TrueSpace ts = new TrueSpace();
        int[] sizes = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int clusterSize =8;
        System.out.println(ts.calculateSpace(sizes, clusterSize));
    }
}
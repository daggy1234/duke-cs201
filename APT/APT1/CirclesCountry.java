public class CirclesCountry {


    CirclesCountry() {
        System.out.println("CirclesCounty");
    }

    public boolean checkInside(int circ_c_x,int circ_c_y,int circ_r,int point_x,int point_y) {
        double circ_eq = Math.pow(point_x - circ_c_x, 2) + Math.pow(point_y - circ_c_y, 2);
        double r = Math.pow(circ_r, 2);
        if (circ_eq < r) {
            return true;
        } else {
            return false;
        }
    }

    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
        
        int count = 0;
        CirclesCountry cc = new CirclesCountry();
        for (int indexer = 0; indexer < x.length; indexer++) {
            // System.out.println(String.format("%d %d %d %d %d", x[indexer], y[indexer], r[indexer], x1, y1));
            boolean xa = cc.checkInside(x[indexer], y[indexer], r[indexer], x1, y1);
            // System.out.println(xa);
            boolean xb = cc.checkInside(x[indexer], y[indexer], r[indexer], x2, y2);
            // System.out.println(xb);
            if (xa && xb) {
                // System.out.println("both inside");
            } else {
                if (xa) {
                //  System.out.println("increment that shit xa");
                 count++;
                } else if (xb) {
                    // System.out.println("increment that shit xb");
                    count++;
                } else {
                    // System.out.println("NO INCREMENT");
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CirclesCountry obj = new CirclesCountry();
        int[] x = {8, -14, 6, 8, 8 };
        int[] y = {-1, 5, 0, 2, -1};
        int[] r = {15, 3, 4, 10, 14};
        int x1 = 4;
        int y1 = -7;
        int x2 = 3;
        int y2 = 3;
        System.out.println(obj.leastBorders(x, y, r, x1, y1, x2, y2));
    }
}
import java.util.ArrayList;

public class ListSum {
    public int sum(ListNode list, int thresh) {
        if (list == null) {
            return 0;
        }
        ListNode root = list;
        int sum = 0;
        while(root.next !=null) {
            int rinf = root.info;
            if (rinf > thresh) {
                sum += root.info;
            }
            root = root.next;
        }
        int rinf = root.info;
        if(rinf >thresh) {
            sum += root.info;
        }
        return sum;
}

    public static void main(String[] args) {
        ListSum ls = new ListSum();

    }

}

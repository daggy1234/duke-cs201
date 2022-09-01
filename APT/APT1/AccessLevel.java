public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        StringBuilder sb = new StringBuilder();
        for (int level: rights) {
            if(level >= minPermission) {
                sb.append('A');
            } else {
                sb.append('D');
            }
        };
        return sb.toString();
    }

    public static void main(String[] args) {
        AccessLevel obj = new AccessLevel();
        int[] rights = {};
        int minPermission = 20;
        System.out.println(obj.canAccess(rights, minPermission));
    }

}

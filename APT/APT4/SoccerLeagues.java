import java.util.Arrays;

public class SoccerLeagues {
    public int[] points(String[] matches) {
       int[] pts = new int[matches.length];
       for (int i = 0; i < matches.length; i++) {
           char[] mstr = matches[i].toCharArray();
           for (int j = 0; j < matches.length; j++) {
               char  toc = mstr[j];
               if (toc == 'W') {
                    pts[i]+= 3;
               } else if (toc == 'L') {
                   pts[j]+= 3;
               } else if (toc == 'D') {
                   pts[i]++;
                   pts[j]++;
               }
           }
       }
       return pts;
    }

    public static void  main(String[] args) {
        SoccerLeagues sl = new SoccerLeagues();
        String[] matches = {"-LWWLWDLDWWWWWWDDWDW",
                "D-WWLDDWDWDLWDDWLWDD",
                "LL-DLDWDLDLDWWWLWDDW",
                "LDD-LLLDLWLWWWWDWDWL",
                "LWWW-DWDLWDWDWWWDWDW",
                "DLLWD-WWLLDDDLWWDWWW",
                "WWLWDL-LLDWWWWWDWWLW",
                "LLLLLDW-LDLWDDLLLDWL",
                "DWWWWDDD-DWWWWDWWWDW",
                "WWWWLLLWL-LWWWWWLWWW",
                "DWWWWWWWLW-WDWWWWWWW",
                "DDDLLLDWWWL-DDWDWLDD",
                "LWLWLDLLLDLW-DDDWWDD",
                "LLWWLWDDLWLWL-WWWDLL",
                "WWWWLLDDDWLWDD-WWWLW",
                "DLDLLLWWLLLWWLW-DWLL",
                "DLWWWLDLWWDWWDWL-WWD",
                "LLDDLLWLLWLWLDLWW-WW",
                "LLWLLLWWLWLWWDWWLD-W",
                "LLWDLWDWDWLLWWDDWWL-"};
        System.out.println(Arrays.toString(sl.points(matches)));
    }
}

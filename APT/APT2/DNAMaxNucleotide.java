package APT.APT2;

public class DNAMaxNucleotide {

    DNAMaxNucleotide() {
        System.out.println("made dnamaxnucleotide");
    }

    public String max(String[] strands, String nuc) {
        String max_cs = "";
        char nchar = nuc.charAt(0);
        long max_count = 0;
        for (String strand: strands) {
            // Because they run old java I can't use lambdas :(
            // long c = strand.chars().filter(ch -> ch == nchar).count();
            long c = 0;
            for (char a: strand.toCharArray()) {
                if (a == nchar) {
                    c++;
                }
            }
            if (c > max_count) {
                max_count = c;
                max_cs = strand;
            } else if (c == max_count && c >0) {
                if (max_cs.length() < strand.length()) {
                    max_cs = strand;
                }
            }

        }
        return max_cs;
  }

    public static void main(String[] args) {
        DNAMaxNucleotide dna = new DNAMaxNucleotide();
        String[] strands  = {"g", "gg", "ggg", "gggg"};
        String nuc = "c";
        System.out.println(dna.max(strands, nuc));
    }
}

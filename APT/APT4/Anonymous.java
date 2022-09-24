import java.util.*;

class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        List<Character> list = new ArrayList<Character>();
        for (String headline : headlines) {
            for (char c : headline.toLowerCase().replaceAll("\\s+","").toCharArray()) {
                list.add(c);
            }
        }
        int count = 0;
        for (String msg: messages) {
            List<Character> msglist = new ArrayList<Character>();
            for (char c : msg.toLowerCase().replaceAll("\\s+","").toCharArray()) {
                msglist.add(c);
            }
            boolean flag = true;
            for (Character c: msglist)  {
                if (Collections.frequency(msglist, c) > Collections.frequency(list, c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
           
        }
        return count;
  }

  public static void main(String[] args) {
    String[] headlines = {"Earthquake in San Francisco ", " Burglary at musuem in Sweden ", " Poverty "};
    String[] messages = {"Give me my money back ", " I am the best coder ", " TOPCODER "};
    Anonymous a = new Anonymous();
    System.out.println(a.howMany(headlines, messages));
  }

}
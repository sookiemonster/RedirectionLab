import java.util.*;

public class PigLatin {
  public static String pigLatinSimple(String s) {
    String[] temp = {"a", "e", "i", "o", "u"};
    ArrayList<String> vowels = new ArrayList<String>(Arrays.asList(temp));
    s = s.toLowerCase();
    if (vowels.contains(s.substring(0, 1))) {
      return s + "hay";
    } else {
      return s.substring(1, s.length()) + s.substring(0,1) + "ay";
    }
  }
}

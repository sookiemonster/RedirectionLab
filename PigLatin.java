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

  public static String pigLatin(String s) {
    String[] digraphTemp = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    ArrayList<String> digraph = new ArrayList<String>(Arrays.asList(digraphTemp));
    String[] vowelsTemp = {"a", "e", "i", "o", "u"};
    ArrayList<String> vowels = new ArrayList<String>(Arrays.asList(vowelsTemp));
    s = s.toLowerCase();
    if (vowels.contains(s.substring(0, 1))) {
      return s + "hay";
    } else if (digraph.contains(s.substring(0,2))) {
      return s.substring(2, s.length()) + s.substring(0, 2) + "ay";
    } else {
      return s.substring(1, s.length()) + s.substring(0,1) + "ay";
    }
  }
}

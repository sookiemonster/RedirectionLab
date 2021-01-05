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

  public static String pigLatinBest(String s) {
    char firstChar = s.charAt(0);
    char lastChar = s.charAt(s.length() - 1);
    if (!Character.isLetter(firstChar)) {
      return s;
    } else if (!Character.isLetter(lastChar)) {
      return pigLatin(s.substring(0, s.length() - 1)) + String.valueOf(lastChar);
    } else {
      return pigLatin(s);
    }
  }

  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    while( n.hasNextLine()) {
      Scanner s = new Scanner(n.nextLine());
      while (s.hasNext()) {
        System.out.print(pigLatinBest(s.next()));
        if (s.hasNext()) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

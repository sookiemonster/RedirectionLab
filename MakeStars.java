import java.util.*;

public class MakeStars {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    while( n.hasNextLine()) {
      Scanner s = new Scanner(n.nextLine());
      while (s.hasNext()) {
        int max = s.next().length();
        for (int i = 0; i < max; i++) {
          System.out.print("*");
          if (i == max - 1) {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}

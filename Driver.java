public class Driver {
  public static void main(String[] args) {
    // Simple Pig Latin
    System.out.println(PigLatin.pigLatinSimple("a"));
    System.out.println(PigLatin.pigLatinSimple("mock"));
    System.out.println(PigLatin.pigLatinSimple("pie"));
    System.out.println(PigLatin.pigLatinSimple("david"));
    System.out.println(PigLatin.pigLatinSimple("aaron"));
    System.out.println();

    // Pig Latin
    System.out.println(PigLatin.pigLatin("the"));
    System.out.println(PigLatin.pigLatin("check"));
    System.out.println(PigLatin.pigLatin("skee"));
    System.out.println(PigLatin.pigLatin("emu"));
    System.out.println(PigLatin.pigLatin("grade"));
  }
}

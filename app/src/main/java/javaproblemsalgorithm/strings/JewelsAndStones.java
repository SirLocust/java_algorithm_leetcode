package javaproblemsalgorithm.strings;

public class JewelsAndStones {
  public int numJewelsInStones(String jewels, String stones) {
    int result = 0;
    for (char jewel : jewels.toCharArray()) {
      for (char stone : stones.toCharArray()) {
        if (jewel == stone) {
          result++;
        }
      }
    }
    return result;
  }
}

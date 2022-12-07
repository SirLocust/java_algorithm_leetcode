package javaproblemsalgorithm.LeetCode75.level1;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
  public boolean isIsomorphic(String s, String t) {
    Map<String, String> wordA = new HashMap<>();
    Map<String, String> wordB = new HashMap<>();
    int length = s.length();

    for (int i = 0; i < length; i++) {

      if (wordA.containsKey(String.valueOf(s.charAt(i)))
          && !wordA.get(String.valueOf(s.charAt(i))).equals(String.valueOf(t.charAt(i)))) {
        return false;
      }
      if ((wordB.containsKey(String.valueOf(t.charAt(i)))
          && !wordB.get(String.valueOf(t.charAt(i))).equals(String.valueOf(s.charAt(i))))) {
        return false;
      }

      wordA.put(String.valueOf(s.charAt(i)), String.valueOf(t.charAt(i)));
      wordB.put(String.valueOf(t.charAt(i)), String.valueOf(s.charAt(i)));
    }

    return true;

  }
}

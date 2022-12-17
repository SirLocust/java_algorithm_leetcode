package javaproblemsalgorithm.strings;

import java.util.Arrays;

import lombok.Builder;

@Builder
public class ShuffleString {
  public String restoreString(String s, int[] indices) {
    int length = indices.length;
    char[] result = new char[length];
    for (int i = 0; i < length; i++) {
      result[indices[i]] = s.charAt(i);
    }
    return String.valueOf(result);
  }
}

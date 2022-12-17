package javaproblemsalgorithm.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShuffleStringTest {

  @Test
  void testRestoreString() {

    String input = "codeleet";
    int[] input2 = { 4, 5, 6, 7, 0, 2, 1, 3 };
    String output = "leetcode";
    String result = ShuffleString.builder().build().restoreString(input, input2);
    assertEquals(output, result);

  }

  @Test
  void testRestoreStringCaseTwo() {

    String input = "abc";
    int[] input2 = { 0, 1, 2 };
    String output = "abc";
    String result = ShuffleString.builder().build().restoreString(input, input2);
    assertEquals(output, result);

  }

}

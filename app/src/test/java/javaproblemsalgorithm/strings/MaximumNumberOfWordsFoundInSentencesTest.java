package javaproblemsalgorithm.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumNumberOfWordsFoundInSentencesTest {

  @Test
  void testMostWordsFound() {
    String[] input = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
    int output = 6;
    int result = MaximumNumberOfWordsFoundInSentences.builder().build().mostWordsFound(input);
    assertEquals(output, result);
  }
}

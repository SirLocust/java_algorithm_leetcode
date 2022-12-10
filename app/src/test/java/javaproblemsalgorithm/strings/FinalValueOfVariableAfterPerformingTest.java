package javaproblemsalgorithm.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FinalValueOfVariableAfterPerformingTest {
  private FinalValueOfVariableAfterPerforming finalValueOfVariableAfterPerforming;

  @BeforeEach
  void star() {
    this.finalValueOfVariableAfterPerforming = new FinalValueOfVariableAfterPerforming();
  }

  @Test
  void testFinalValueAfterOperations() {
    String[] input = { "--X", "X++", "X++" };
    int output = 1;
    int result = this.finalValueOfVariableAfterPerforming.finalValueAfterOperations(input);
    assertEquals(output, result);
  }

  @Test
  void testFinalValueAfterOperationsTwo() {
    String[] input = { "++X", "++X", "X++" };
    int output = 3;
    int result = this.finalValueOfVariableAfterPerforming.finalValueAfterOperations(input);
    assertEquals(output, result);
  }

  @Test
  void testFinalValueAfterOperationsThree() {
    String[] input = { "X++", "++X", "--X", "X--" };
    int output = 0;
    int result = this.finalValueOfVariableAfterPerforming.finalValueAfterOperations(input);
    assertEquals(output, result);
  }
}

package javaproblemsalgorithm.LeetCode75.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindPivotIndexTest {

  private FindPivotIndex findPivotIndex;

  @BeforeEach

  void start() {
    this.findPivotIndex = new FindPivotIndex();

  }

  @Test
  void testPivotIndex() {
    int[] input = { 1, 7, 3, 6, 5, 6 };
    int result = this.findPivotIndex.pivotIndex(input);
    assertEquals(3, result);
  }

  @Test
  void testPivotIndexIsZero() {
    int[] input = { 2, 1, -1 };
    int[] input2 = { -1, 1, 2 };
    int result = this.findPivotIndex.pivotIndex(input);
    int result2 = this.findPivotIndex.pivotIndex(input2);

    assertEquals(0, result);
    assertEquals(0, result2);

  }

  @Test
  void testPivotIndexIsMinusOne() {

    int[] input = { 1, 2, 3 };
    int[] input2 = { -1, -1, -1, -1, -1, -1 };

    int result = this.findPivotIndex.pivotIndex(input);
    int result2 = this.findPivotIndex.pivotIndex(input2);

    assertEquals(-1, result);
    assertEquals(-1, result2);

  }

}

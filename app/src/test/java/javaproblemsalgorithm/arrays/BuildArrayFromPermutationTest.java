package javaproblemsalgorithm.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuildArrayFromPermutationTest {

  private BuildArrayFromPermutation buildArrayFromPermutation;

  @BeforeEach
  void start() {
    this.buildArrayFromPermutation = new BuildArrayFromPermutation();
  }

  @Test
  void testBuildArray() {

    int[] input = { 0, 2, 1, 5, 3, 4 };
    int[] output = { 0, 1, 2, 4, 5, 3 };
    int[] result = this.buildArrayFromPermutation.buildArray(input);

    int[] input1 = { 5, 0, 1, 2, 3, 4 };
    int[] output1 = { 4, 5, 0, 1, 2, 3 };
    int[] result1 = this.buildArrayFromPermutation.buildArray(input1);

    assertArrayEquals(output, result);
    assertArrayEquals(output1, result1);

  }
}

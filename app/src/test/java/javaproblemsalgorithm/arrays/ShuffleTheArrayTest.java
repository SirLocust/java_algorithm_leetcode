package javaproblemsalgorithm.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShuffleTheArrayTest {

  private ShuffleTheArray shuffleTheArray;

  @BeforeEach
  void start() {
    this.shuffleTheArray = new ShuffleTheArray();
  }

  @Test
  void testShuffle() {
    int[] inputA = { 2, 5, 1, 3, 4, 7 };
    int inputB = 3;
    int[] output = { 2, 3, 5, 4, 1, 7 };
    int[] result = this.shuffleTheArray.shuffle(inputA, inputB);
    assertArrayEquals(output, result);
  }

  @Test
  void testShuffleCaseTwo() {
    int[] inputA = { 1, 2, 3, 4, 4, 3, 2, 1 };
    int inputB = 4;
    int[] output = { 1, 4, 2, 3, 3, 2, 4, 1 };
    int[] result = this.shuffleTheArray.shuffle(inputA, inputB);
    assertArrayEquals(output, result);
  }
}

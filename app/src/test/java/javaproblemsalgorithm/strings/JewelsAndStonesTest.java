package javaproblemsalgorithm.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javaproblemsalgorithm.strings.JewelsAndStones;

public class JewelsAndStonesTest {

  private JewelsAndStones jewelsAndStones;

  @BeforeEach
  void start() {
    this.jewelsAndStones = new JewelsAndStones();
  }

  @Test
  void testNumJewelsInStonesCaseOne() {
    String inputA = "aA";
    String inputB = "aAAbbbb";
    int result = this.jewelsAndStones.numJewelsInStones(inputA, inputB);
    assertEquals(3, result);

  }

  @Test
  void testNumJewelsInStonesCaseTwo() {
    String inputA = "z";
    String inputB = "ZZ";
    int result = this.jewelsAndStones.numJewelsInStones(inputA, inputB);
    assertEquals(0, result);

  }
}

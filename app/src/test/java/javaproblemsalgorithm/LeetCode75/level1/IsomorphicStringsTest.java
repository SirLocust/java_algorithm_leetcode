package javaproblemsalgorithm.LeetCode75.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IsomorphicStringsTest {

  private IsomorphicStrings isomorphicStrings;

  @BeforeEach
  void setUp() {
    this.isomorphicStrings = new IsomorphicStrings();
  }

  @Test
  void testIsIsomorphic() {
    String inputA = "egg";
    String inputB = "add";

    String inputA1 = "paper";
    String inputB2 = "title";
    boolean result = this.isomorphicStrings.isIsomorphic(inputA, inputB);
    boolean result1 = this.isomorphicStrings.isIsomorphic(inputA1, inputB2);

    // assertEquals(true, result);
    assertEquals(true, result1);

  }

  @Test
  void testIsIsomorphicIsFalse() {
    String inputA = "foo";
    String inputB = "bar";

    String inputA1 = "badc";
    ;
    String inputB2 = "baba";
    String inputA3 = "badc";
    ;
    String inputB3 = "baba";
    boolean result = this.isomorphicStrings.isIsomorphic(inputA, inputB);
    boolean result1 = this.isomorphicStrings.isIsomorphic(inputA1, inputB2);
    boolean result3 = this.isomorphicStrings.isIsomorphic(inputA3, inputB3);

    assertEquals(false, result);
    assertEquals(false, result1);
    assertEquals(false, result3);

  }
}

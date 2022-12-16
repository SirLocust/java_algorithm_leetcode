package javaproblemsalgorithm.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RichestCustomerWealthTest {
  @Test
  void testMaximumWealthCaseOne() {
    int[][] input = { { 1, 2, 3 }, { 3, 2, 1 } };
    int output = 6;
    int result = RichestCustomerWealth.builder().build().maximumWealth(input);
    assertEquals(output, result);
  }

  @Test
  void testMaximumWealthCaseTwo() {
    int[][] input = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
    int output = 17;
    int result = RichestCustomerWealth.builder().build().maximumWealth(input);
    assertEquals(output, result);
  }

  @Test
  void testMaximumWealthCaseThree() {
    int[][] input = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
    int output = 10;
    int result = RichestCustomerWealth.builder().build().maximumWealth(input);
    assertEquals(output, result);
  }
}

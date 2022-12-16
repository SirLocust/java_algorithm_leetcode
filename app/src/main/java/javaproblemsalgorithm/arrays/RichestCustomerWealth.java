package javaproblemsalgorithm.arrays;

import lombok.Builder;

@Builder
public class RichestCustomerWealth {
  public int maximumWealth(int[][] accounts) {
    int length = accounts.length;
    int result = 0;
    for (int i = 0; i < length; i++) {
      int temResult = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        temResult += accounts[i][j];
      }
      if (result < temResult) {
        result = temResult;
      }
    }
    return result;
  }
}

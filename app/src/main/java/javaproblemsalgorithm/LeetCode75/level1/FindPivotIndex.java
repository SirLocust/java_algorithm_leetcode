package javaproblemsalgorithm.LeetCode75.level1;

import javax.swing.text.AbstractDocument.LeafElement;

public class FindPivotIndex {
  public int pivotIndex(int[] nums) {
    int lenght = nums.length;
    int movent = 0;
    while (movent < lenght) {
      int sum = 0;
      int sum2 = 0;
      for (int i = movent + 1; i <= lenght - 1; i++) {
        sum += nums[i];
      }
      for (int i = movent + 1; i > 1; i--) {
        sum2 += nums[i - 2];
      }
      if (sum == sum2) {
        return movent;
      }
      if ((movent == 0 && movent == sum) || (movent == lenght - 1 && sum2 == 0)) {
        return 0;
      }
      movent++;
    }
    return -1;
  }
}

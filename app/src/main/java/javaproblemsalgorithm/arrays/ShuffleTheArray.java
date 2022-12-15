package javaproblemsalgorithm.arrays;

public class ShuffleTheArray {
  public int[] shuffle(int[] nums, int n) {
    final int length = nums.length;
    int[] result = new int[length];
    int count = 0;
    for (int i = 0; i < length; i += 2) {
      result[i] = nums[count];
      result[i + 1] = nums[count++ + n];
    }
    return result;
  }
}

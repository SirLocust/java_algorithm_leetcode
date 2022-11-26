package javaproblemsalgorithm.LeetCode75.level1;

public class RunningSumof1dArray {

  public int[] runningSum(int[] nums) {
    int[] result = new int[nums.length];
    int lenght = nums.length;
    int pos = 0;
    int sum = 0;
    while(pos<lenght){
      sum += nums[pos];
      result[pos] = sum;
      pos++;
    } 
    return result;
  }
  
}

package javaproblemsalgorithm.LeetCode75.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

  public int[] runningSumFuctional(int[] nums) {
    List<Integer> result = new ArrayList<>(List.of(nums[0]));
    
    return Arrays.stream(nums)
          .boxed()
          .reduce( (a, b) -> {
            result.add(a+b);
            return a+b;
          } )
          .map((a) ->  result.stream())
          .get()
          .mapToInt(Integer::intValue)
          .toArray();
          
        
          
          
           
          
    
  }

  
}

package javaproblemsalgorithm.LeetCode75.level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class RunningSumof1dArrayTest {

  
  @Test
  void testRunningSum() {

    RunningSumof1dArray problem = new RunningSumof1dArray();
    int input[] = {3,1,2,10,1} ;
    int output[] = {3,4,6,16,17} ;

    int[] result = problem.runningSum(input);
    assertArrayEquals(output,result);

  }

  @Test
  void testRunningSumFuctional() {
    RunningSumof1dArray problem = new RunningSumof1dArray();
    int input[] = {3,1,2,10,1} ;
    int output[] = {3,4,6,16,17} ;
    int[] result = problem.runningSumFuctional(input);
    assertArrayEquals(output,result);
  }

  

}

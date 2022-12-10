package javaproblemsalgorithm.strings;

public class FinalValueOfVariableAfterPerforming {
  public int finalValueAfterOperations(String[] operations) {
    int length = operations.length;
    int sum = 0;
    for (int i = 0; i < length; i++) {
      sum = operations[i].contains("+") ? ++sum : --sum;
    }
    return sum;
  }
}

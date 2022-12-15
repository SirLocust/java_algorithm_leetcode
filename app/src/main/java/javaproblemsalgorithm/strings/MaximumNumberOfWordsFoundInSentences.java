package javaproblemsalgorithm.strings;

import lombok.Builder;

@Builder
public class MaximumNumberOfWordsFoundInSentences {
  public int mostWordsFound(String[] sentences) {
    int lenght = sentences.length;
    int result = 0;
    for (int i = 0; i < lenght; i++) {
      if (sentences[i].split(" ").length > result) {
        result = sentences[i].split(" ").length;
      }
    }
    return result;
  }
}

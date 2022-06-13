package longestWord.model;

import java.util.Iterator;

public class LongestWordFinder {

  Iterator<String> iterator;
  String longestWord;
  String currentWord;

  public LongestWordFinder(Iterator<String> iterable) {
    this.iterator = iterable;
    longestWord = "";
    currentWord = "";
  }

  public String findLongestWord() {
    while (iterator.hasNext()) {
      currentWord = iterator.next().replaceAll("[^a-zA-Z0-9]", " ");
      if (currentWord.length() > longestWord.length()) {
        longestWord = currentWord;
      }
    }
    return longestWord;
  }

  public Iterator<String> getIterator() {
    return iterator;
  }

  public void setIterator(Iterator<String> iterator) {
    this.iterator = iterator;
  }

  public String getLongestWord() {
    return longestWord;
  }

  public String getCurrentWord() {
    return currentWord;
  }
}

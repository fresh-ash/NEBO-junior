package longestWord.view;

public class LongestWordConsoleView implements LongestWordView{

  @Override
  public void showResult(String result, String fileName) {
    System.out.println("The longest word in file: " + fileName + " is " + result);
  }

  @Override
  public void showInfoMessage(String message) {
    System.out.println(message);
  }
}

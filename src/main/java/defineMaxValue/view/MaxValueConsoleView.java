package defineMaxValue.view;

public class MaxValueConsoleView implements MaxValueView {

  @Override
  public void showResult(Double maxValue) {
    System.out.println("Max value: " + maxValue);
  }

  @Override
  public void showInfoMessage(String message) {
    System.out.println(message);
  }
}

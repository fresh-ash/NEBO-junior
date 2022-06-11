package degreeConverter.view;

public class ConsoleConverterView implements ConverterView {

  @Override
  public void showResult(Double convertedValue, Double convertableValue) {
    System.out.println("Random Fahrenheit degrees value: " + convertableValue +
        "\nConverted to Celsius degrees value: " + convertedValue);
  }

  @Override
  public void showInfoMessage(String message) {
    System.out.println(message);
  }
}

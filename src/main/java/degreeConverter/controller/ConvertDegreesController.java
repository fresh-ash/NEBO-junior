package degreeConverter.controller;

import common.CommonUtilities;
import common.Input;
import common.Messages;
import degreeConverter.model.Convertable;
import degreeConverter.model.FahrenheitToCelsiusDegreeConverter;
import degreeConverter.view.ConsoleConverterView;
import degreeConverter.view.ConverterView;

public class ConvertDegreesController {

  Convertable convertable;
  ConverterView view;
  Double convertableValue;
  Input cli;

  public ConvertDegreesController(Double convertableValue, Input input) {
    this.convertableValue = convertableValue;
    this.cli = input;
  }

  public ConvertDegreesController(Input input) {
    this.cli = input;
  }

  public Double convertFahrenheitToCelsiusDegreesRandomValue() {
    convertableValue = CommonUtilities.getRandomDoubleValue(-1000.0, 1000.0);
    convertable = new FahrenheitToCelsiusDegreeConverter();
    return convertable.convert(convertableValue);
  }

  public void showResultInConsole(Double convertedDegrees) {
    view = new ConsoleConverterView();
    view.showResult(convertedDegrees, convertableValue);
  }

  public void startConvertDegreesApp() {
    try {
      showResultInConsole(convertFahrenheitToCelsiusDegreesRandomValue());
    }
    catch (Exception e) {
      view.showInfoMessage("Something went wrong!\n" + e.getMessage());
    }
    if (cli.checkAnswer(Messages.CHECK_ANSWER)){
      startConvertDegreesApp();
    }
  }

  public Convertable getConvertable() {
    return convertable;
  }

  public void setConvertable(Convertable convertable) {
    this.convertable = convertable;
  }

  public ConverterView getView() {
    return view;
  }

  public void setView(ConverterView view) {
    this.view = view;
  }

  public Double getConvertableValue() {
    return convertableValue;
  }

  public void setConvertableValue(Double convertableValue) {
    this.convertableValue = convertableValue;
  }
}

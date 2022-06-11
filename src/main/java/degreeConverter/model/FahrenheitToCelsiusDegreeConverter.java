package degreeConverter.model;

public class FahrenheitToCelsiusDegreeConverter implements Convertable {

  @Override
  public Double convert(Double beforeValue) {
    return (beforeValue - 32) * 5/9;
  }
}

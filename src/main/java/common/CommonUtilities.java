package common;

import java.util.concurrent.ThreadLocalRandom;

public class CommonUtilities {

  private CommonUtilities() {}

  public static Double getRandomDoubleValue(Double from, Double to) {
    return ThreadLocalRandom.current().nextDouble(from, to);
  }
}

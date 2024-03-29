package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CommonUtilities {

  private CommonUtilities() {}

  public static Double getRandomDoubleValue(Double from, Double to) {
    return ThreadLocalRandom.current().nextDouble(from, to);
  }

  public static Double validateInput(String str) throws IllegalArgumentException {
    if ((!str.equals("")) && str != null) {
      return Double.valueOf(str);
    }
    else {
      throw new IllegalArgumentException();
    }
  }

  public static Double getMaxValueFromArrayList(List list) {
    return (Double) Collections.max(list);
  }

  public static Scanner openFileInScanner(String pathToFile) throws FileNotFoundException {
    return new Scanner(new File(pathToFile));
  }
}

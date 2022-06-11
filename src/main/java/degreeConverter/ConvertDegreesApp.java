package degreeConverter;

import common.CLI;
import common.Command;
import degreeConverter.controller.ConvertDegreesController;
import java.util.Scanner;

public class ConvertDegreesApp implements Command {

  @Override
  public void runCommand() {
    ConvertDegreesController controller = new ConvertDegreesController(new CLI(new Scanner(System.in)));
    controller.startConvertDegreesApp();
  }
}

package defineMaxValue;

import common.CLI;
import common.Command;
import defineMaxValue.controller.MaxValueController;
import defineMaxValue.view.MaxValueConsoleView;
import java.util.Scanner;

public class DefineMaxValueApp implements Command {

  @Override
  public void runCommand() {
    MaxValueController controller = new MaxValueController(new CLI(new Scanner(System.in)), new MaxValueConsoleView());
    controller.startApp();
  }
}

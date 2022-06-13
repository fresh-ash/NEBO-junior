package longestWord;

import common.CLI;
import common.Command;
import java.util.Scanner;
import longestWord.controller.LongestWordController;
import longestWord.view.LongestWordConsoleView;

public class LongestWordApp implements Command {

  @Override
  public void runCommand() {
    LongestWordController controller = new LongestWordController(new CLI(new Scanner(System.in)),
        new LongestWordConsoleView());
    controller.showWelcomeMessageAndStart();
  }
}

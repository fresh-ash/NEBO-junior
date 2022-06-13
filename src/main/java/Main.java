import common.CLI;
import common.Command;
import common.Input;
import common.Messages;
import defineMaxValue.DefineMaxValueApp;
import degreeConverter.ConvertDegreesApp;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import longestWord.LongestWordApp;

public class Main {

  public static void main(String[] args) {
    boolean continueApp = true;
    Map<String, Command> applications = new HashMap<>();
    Input input = new CLI(new Scanner(System.in));
    applications.put("1", new ConvertDegreesApp());
    applications.put("2", new DefineMaxValueApp());
    applications.put("3", new LongestWordApp());

    while (continueApp) {
      try {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        String consoleInput = input.waitInput(Messages.START_MAIN_MESSAGE);
        if (consoleInput.equals("0")){
          break;
        }
        applications.get(consoleInput).runCommand();
      }
      catch (NullPointerException e){
        System.err.println(Messages.INCORRECT_INPUT);
      }
    }
  }
}

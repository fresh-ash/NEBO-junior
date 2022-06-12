package defineMaxValue.controller;

import common.CommonUtilities;
import common.Input;
import common.Messages;
import defineMaxValue.view.MaxValueView;
import java.util.ArrayList;
import java.util.List;

public class MaxValueController {

  Input cli;
  MaxValueView view;
  List<Double> userData;

  public MaxValueController(Input cli, MaxValueView view) {
    this.cli = cli;
    this.view = view;
    userData = new ArrayList<>();
  }

  public void startApp() {
    view.showInfoMessage(Messages.MAX_VALUE_WELCOME_MESSAGE);
    getUserDataAndShowResult();
  }

  public void getUserDataAndShowResult() {
    int neededArgsCount = 3;
    String[] args = Input.splitInput(cli.waitInput(Messages.MAX_VALUE_APP_INPUT_FORMAT), ",");
    try {
      if (args.length == neededArgsCount) {
        for (String arg : args) {
          userData.add(CommonUtilities.validateInput(arg));
        }
      }
      else {
        throw new IllegalArgumentException();
      }
      view.showResult(CommonUtilities.getMaxValueFromArrayList(userData));
    }
    catch (IllegalArgumentException e) {
      view.showInfoMessage(Messages.INCORRECT_INPUT);
    }
    if (cli.checkAnswer(Messages.CHECK_ANSWER)) {
      getUserDataAndShowResult();
    }
  }
}

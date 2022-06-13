package longestWord.controller;

import common.CommonUtilities;
import common.Input;
import common.Messages;
import java.io.FileNotFoundException;
import java.util.Scanner;
import longestWord.model.LongestWordFinder;
import longestWord.view.LongestWordView;

public class LongestWordController {

  Input cli;
  LongestWordView view;
  LongestWordFinder longestWordFinder;

  public LongestWordController(Input cli, LongestWordView view) {
    this.cli = cli;
    this.view = view;
  }

  public void showWelcomeMessageAndStart() {
    view.showInfoMessage(Messages.LONGEST_WORD_WELCOME_MESSAGE);
    getDataAndStart();
  }

  public void getDataAndStart() {
    String fileName = cli.waitInput(Messages.LONGEST_WORD_FORMAT_INPUT);
    try {
      Scanner scanner = CommonUtilities.openFileInScanner(fileName);
      longestWordFinder = new LongestWordFinder(CommonUtilities.openFileInScanner(fileName));
      view.showResult(longestWordFinder.findLongestWord(), fileName);
    }
    catch (IllegalArgumentException e) {
      view.showInfoMessage(Messages.INCORRECT_INPUT);
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (Exception e) {
      view.showInfoMessage(Messages.UNEXPECTED_ERROR + e.getMessage());
    }
    if (cli.checkAnswer(Messages.CHECK_ANSWER)){
      getDataAndStart();
    }
  }
}

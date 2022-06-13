package common;

public interface Messages {

  String START_MAIN_MESSAGE = "\n==========NEBO Tasks==========\n" +
      "| 1. Degrees Converter          |\n" +
      "| 2. Max Value determinant      |\n" +
      "| 3. Longest word in file       |\n" +
      "Please, type your choice with nex format: <number>";

  String INCORRECT_INPUT = "Incorrect input! Try again!\n";
  String UNEXPECTED_ERROR = "Something went wrong!\n";
  String CHECK_ANSWER = "Do you want to continue?\nPlease, type 'yes' or 'y':";

  String MAX_VALUE_WELCOME_MESSAGE = "==========MAX VALUE===========";
  String MAX_VALUE_APP_INPUT_FORMAT = "Please, enter your data with next format:\n<value1>,<value2>,<value3>";

  String ITERATOR_WELCOME_MESSAGE = "==========ITERATOR===========";

  String LONGEST_WORD_WELCOME_MESSAGE = "==========LONGEST WORD==========";
  String LONGEST_WORD_FORMAT_INPUT = "Please, enter path to file with next format: /path/to/file";
}

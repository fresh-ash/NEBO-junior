package common;

import java.util.Scanner;

public class CLI implements Input {

  Scanner scanner;

  public CLI(Scanner scanner) {
    this.scanner = scanner;
  }

  @Override
  public String waitInput(String welcomeMessage) {
    System.out.println(welcomeMessage);
    String str = scanner.nextLine();
    return str;
  }

  @Override
  public boolean checkAnswer(String str) {
    String answer = waitInput(str);
    answer = answer.toLowerCase();
    return  (answer.equals("y")  || answer.equals("yes"));
  }

  public Scanner getScanner() {
    return scanner;
  }

  public void setScanner(Scanner scanner) {
    this.scanner = scanner;
  }
}

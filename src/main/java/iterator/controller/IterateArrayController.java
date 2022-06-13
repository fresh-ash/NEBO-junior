package iterator.controller;

import common.Input;
import common.Messages;
import iterator.view.IteratorView;

public class IterateArrayController {

  Input cli;
  IteratorView view;

  public IterateArrayController(Input cli, IteratorView view) {
    this.cli = cli;
    this.view = view;
  }

  public void startApp() {
    view.showInfoMessage(Messages.ITERATOR_WELCOME_MESSAGE);
  }

  public void getData() {

  }
}

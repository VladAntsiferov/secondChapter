package by.vantsyferov.second.entity.impl;

import by.vantsyferov.second.entity.TextComponent;

import java.util.Collections;
import java.util.List;

public class LeafComponent implements TextComponent {

  private char symbol;

  public LeafComponent(char symbol){
    this.symbol = symbol;
  }

  @Override
  public void add(TextComponent component) {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<TextComponent> getChildren() {
    return Collections.emptyList();
  }
}

package by.vantsyferov.second.parser.impl;

import by.vantsyferov.second.entity.TextComponent;
import by.vantsyferov.second.parser.TextParserInt;

public abstract class AbstractParser implements TextParserInt {

  public AbstractParser next;

  public void setNext(AbstractParser next){
    this.next = next;
  }

  public abstract void parse(String text, TextComponent component);

}

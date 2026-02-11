package by.vantsyferov.second.parser.impl;

import by.vantsyferov.second.entity.TextComponent;
import by.vantsyferov.second.entity.impl.LeafComponent;
import by.vantsyferov.second.parser.RegexConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolParser extends AbstractParser {

  private static final Pattern SymbolPatter = Pattern.compile(RegexConstants.SYMBOL_SPLIT_REGEX);

  @Override
  public void parse(String text, TextComponent parent) {
    Matcher matcher = SymbolPatter.matcher(text);
    while (matcher.find()) {
      char symbol = matcher.group().charAt(0);
      parent.add(new LeafComponent(symbol));
    }
  }
}
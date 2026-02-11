package by.vantsyferov.second.parser.impl;

import by.vantsyferov.second.entity.ComponentType;
import by.vantsyferov.second.entity.TextComponent;
import by.vantsyferov.second.entity.impl.TextComposite;
import by.vantsyferov.second.parser.RegexConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser extends AbstractParser {

  private static final Pattern WordPattern = Pattern.compile(RegexConstants.WORD_SPLIT_REGEX);

  @Override
  public void parse(String text, TextComponent parent) {
    Matcher matcher = WordPattern.matcher(text);
    while (matcher.find()) {
      String lexemeText = matcher.group();
      TextComponent lexeme = new TextComposite(ComponentType.WORD);
      parent.add(lexeme);
      if (next != null) {
        next.parse(lexemeText, lexeme);
      }
    }
  }
}
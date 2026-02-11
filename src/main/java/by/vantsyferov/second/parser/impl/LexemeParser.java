package by.vantsyferov.second.parser.impl;

import by.vantsyferov.second.entity.ComponentType;
import by.vantsyferov.second.entity.TextComponent;
import by.vantsyferov.second.entity.impl.TextComposite;
import by.vantsyferov.second.parser.RegexConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeParser extends AbstractParser {

  private static final Pattern LexemePatter = Pattern.compile(RegexConstants.LEXEME_SPLIT_REGEX);

  @Override
  public void parse(String text, TextComponent parent) {
    Matcher matcher = LexemePatter.matcher(text);
    while (matcher.find()) {
      String lexemeText = matcher.group();
      TextComponent lexeme = new TextComposite(ComponentType.LEXEME);
      parent.add(lexeme);
      if (lexemeText.isBlank()) {
        next.parse(lexemeText, lexeme);
      }
    }
  }
}
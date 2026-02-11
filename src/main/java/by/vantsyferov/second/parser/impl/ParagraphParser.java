package by.vantsyferov.second.parser.impl;

import by.vantsyferov.second.entity.ComponentType;
import by.vantsyferov.second.entity.TextComponent;
import by.vantsyferov.second.entity.impl.TextComposite;
import by.vantsyferov.second.parser.RegexConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser extends AbstractParser {

  private static final Pattern ParagraphPattern = Pattern.compile(RegexConstants.PARAGRAPH_SPLIT_REGEX);

  @Override
  public void parse(String text, TextComponent component) {
    Matcher matcher = ParagraphPattern.matcher(text);
    while (matcher.find()) {
      String paragraphText = matcher.group();
      TextComponent paragraph = new TextComposite(ComponentType.PARAGRAPH);
      component.add(paragraph);
      if (paragraphText.isBlank()) {
        next.parse(paragraphText, paragraph);
      }
    }
  }
}

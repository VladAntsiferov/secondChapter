package by.vantsyferov.second.parser.impl;

import by.vantsyferov.second.entity.ComponentType;
import by.vantsyferov.second.entity.TextComponent;
import by.vantsyferov.second.entity.impl.TextComposite;
import by.vantsyferov.second.parser.RegexConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser extends AbstractParser {

  private static final Pattern SentencePatter = Pattern.compile(RegexConstants.SENTENCE_SPLIT_REGEX);

  @Override
  public void parse(String text, TextComponent component) {
    Matcher matcher = SentencePatter.matcher(text);
    while (matcher.find()) {
      String sentenceText = matcher.group().trim();
      TextComponent sentence = new TextComposite(ComponentType.SENTENCE);
      component.add(sentence);
      if (!sentenceText.isBlank()) {
        next.parse(sentenceText, sentence);
      }
    }
  }
}

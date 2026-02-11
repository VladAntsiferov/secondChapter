package by.vantsyferov.second.parser;

public class RegexConstants {
  public static final String PARAGRAPH_SPLIT_REGEX = "\\n+";
  public static final String SENTENCE_SPLIT_REGEX = "(?<=[.!?])\\s+";
  public static final String LEXEME_SPLIT_REGEX = "\\s+";
  public static final String WORD_SPLIT_REGEX = "[^a-zA-Zа-яА-Я]+";
  public static final String SYMBOL_SPLIT_REGEX = "\\S";
}

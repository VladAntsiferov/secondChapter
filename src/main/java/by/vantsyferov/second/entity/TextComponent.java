package by.vantsyferov.second.entity;

import java.util.List;

public interface TextComponent {
  void add(TextComponent component);
  List<TextComponent> getChildren();
}

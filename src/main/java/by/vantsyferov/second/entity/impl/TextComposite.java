package by.vantsyferov.second.entity.impl;

import by.vantsyferov.second.entity.ComponentType;
import by.vantsyferov.second.entity.TextComponent;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {

  private ComponentType type;

  private List<TextComponent> children = new ArrayList<>();

  public TextComposite(ComponentType type){
    this.type = type;
  }

  @Override
  public void add(TextComponent component) {
    children.add(component);
  }

  @Override
  public List<TextComponent> getChildren() {
    return children;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    TextComposite that = (TextComposite) o;
    return type == that.type && children.equals(that.children);
  }

  @Override
  public int hashCode() {
    int result = type.hashCode();
    result = 31 * result + children.hashCode();
    return result;
  }
}

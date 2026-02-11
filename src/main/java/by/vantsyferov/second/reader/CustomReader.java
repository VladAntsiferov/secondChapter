package by.vantsyferov.second.reader;

import by.vantsyferov.second.exception.ReadingFileException;

import java.util.List;

public interface CustomReader{
  String readFile(String CustomFileName) throws ReadingFileException;
}

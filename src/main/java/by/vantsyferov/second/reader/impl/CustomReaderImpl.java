package by.vantsyferov.second.reader.impl;

import by.vantsyferov.second.exception.ReadingFileException;
import by.vantsyferov.second.reader.CustomReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomReaderImpl implements CustomReader {

  static Logger logger = LogManager.getLogger();
  private static final String DEFAULT_FILENAME = "data/input.txt";

  @Override
  public String readFile(String customFileName) throws ReadingFileException {
    String text ="";
    logger.info("Function readFile(String customFileName) called");
    Path filePath = Paths.get(customFileName);
    if (!Files.exists(filePath)) {
      logger.error("File {} not found, fallback to {}", customFileName, DEFAULT_FILENAME);
      filePath = Path.of(DEFAULT_FILENAME);
    }
    try {
      text = Files.readString(filePath, StandardCharsets.UTF_8);
      logger.info("File '{}' read successfully", filePath);
    } catch (NoSuchFileException e){
      logger.error("No such file: {}", e.getMessage());
    } catch (IOException e) {
      logger.error("Error reading file {}", e.getMessage());
      throw new ReadingFileException("Error reading file");
    }
    return text;
  }

}

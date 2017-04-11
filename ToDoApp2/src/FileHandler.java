import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by peter on 2017.04.07..
 */
public class FileHandler {

  public List<String> readFromFile(Path fileLocation) {
    try {
      return Files.readAllLines(fileLocation);
    } catch (IOException ex) {
      System.out.println(
              "I/O Exception occurred while trying to read from file: " + fileLocation.toString());
      return null;
    }
  }

  public void printToFile(Path fileLocation, List<String> toPrint) {
    try {
      Files.write(fileLocation, toPrint);
    } catch (IOException ex) {
      System.out.println(
              "I/O Exception occurred while trying to read from file: " + fileLocation.toString());
    }
  }
}

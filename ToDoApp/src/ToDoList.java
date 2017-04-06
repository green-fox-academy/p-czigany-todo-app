import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by peter on 2017.04.06..
 */
public class ToDoList {

  public ToDoList() {
  }

  public void printFile(Path fileLocation) {
    System.out.println();
    List<String> fileLines = readFromFile(fileLocation);
    for (String line :
            fileLines) {
      System.out.println(line);
    }
    System.out.println();
  }

  public List<String> readFromFile(Path fileLocation) {
    try {
      return Files.readAllLines(fileLocation);
    } catch (IOException ex) {
      System.out.println("I/O Exception occurred while trying to read from file.");
      return null;
    }
  }
}

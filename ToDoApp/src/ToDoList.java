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

  public void printUserInfo(Path fileLocation) {
    printLines(fileLocation, false);
  }

  public void printList(Path fileLocation) {
    printLines(fileLocation, true);
  }

  public void printLines(Path fileLocation, boolean listFormat) {
    System.out.println();
    List<String> fileLines = readFromFile(fileLocation);
    for (int i = 0; i < fileLines.size(); i++) {
      if (listFormat) {
        System.out.println("  " + (i + 1) + " - " + fileLines.get(i));
      } else {
        System.out.println(fileLines.get(i));
      }
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

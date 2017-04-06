import java.io.IOException;
import java.nio.charset.Charset;
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
    System.out.println();
    List<String> fileLines = readFromFile(fileLocation);
    for (int i = 0; i < fileLines.size(); i++) {
      System.out.println(fileLines.get(i));
    }
    System.out.println();
  }

  public void printList(Path fileLocation) {
    System.out.println();
    List<String> fileLines = readFromFile(fileLocation);
    for (int i = 0; i < fileLines.size(); i++) {
      System.out.println("  " + (i + 1) + " - " + fileLines.get(i));
    }
    if (fileLines.size() == 0) {
      System.out.println("  No todos for today! :)");
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

  public void printLineToFile(Path filePath, String toAdd) {
    if (toAdd.length() == 0) {
      System.out.println("\n  Unable to add: no task provided\n");
    } else {
      List<String> toPrint = readFromFile(filePath);
      toPrint.add(toAdd);
      try {
        Files.write(filePath, toPrint, Charset.forName("UTF-8"));
      } catch (IOException ex) {
        System.out.println("I/O Exception occurred while trying to write to a file.");
      }
    }
  }
}

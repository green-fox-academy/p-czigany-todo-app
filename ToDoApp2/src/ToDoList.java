import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.04.07..
 */
public class ToDoList {

  private List<ToDo> tasks;

  public ToDoList(Path filePath) {
    FileHandler handler = new FileHandler();
    List<String> lines = handler.readFromFile(filePath);
    tasks = new ArrayList<>();
    for (String line :
            lines) {
      tasks.add(new ToDo(line));
    }
  }

  public String printList() {
    String output = "\n";
    if (tasks.size() == 0) {
      output += "  No todos for today! :)";
    } else {
      for (int i = 0; i < tasks.size(); i++) {
        output += "  " + (i + 1) + " - " + tasks.get(i).printTask() + "\n";
      }
    }
    return output;
  }
}

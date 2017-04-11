import java.nio.file.Path;
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

  public void newTaskFromInput(String[] args) {
    ArgumentHandler handler = new ArgumentHandler(args);
    tasks.add(new ToDo("[ ] " + handler.inputTask()));
  }

  public void listToFile(Path filePath) {
    FileHandler handler = new FileHandler();
    List<String> lines = new ArrayList<>();
    for (ToDo task:
    tasks) {
      lines.add(task.printTask());
    }
    handler.printToFile(filePath, lines);
  }
}

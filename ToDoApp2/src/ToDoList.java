import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.04.07..
 */
public class ToDoList {

  private List<ToDo> tasks;

  public ToDoList() {
    this.tasks = new ArrayList<>();
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

  public void addTask(ToDo toAdd) {
    tasks.add(toAdd);
  }

  public void removeTask(Integer taskIndex) {
    this.tasks.remove(taskIndex - 1);
  }
}

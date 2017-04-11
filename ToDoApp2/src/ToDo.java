/**
 * Created by peter on 2017.04.07..
 */
public class ToDo {

  private String description;
  private boolean completed;

  public ToDo(String inputText) {
    if (inputText.substring(0,3).equals("[x]")) {
      completed = true;
    } else if (inputText.substring(0,3).equals("[ ]"))
    completed = false;
    description = inputText.substring(4);
  }

  public String printTask() {
    return (completed) ? "[x] " + description : "[ ] " + description;
  }
}

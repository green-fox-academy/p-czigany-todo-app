/**
 * Created by peter on 2017.04.07..
 */
public class ToDo {

  private String description;
  private boolean completed;

  public ToDo(String inputText) {
    this.completed = false;
    this.description = inputText;
  }

  public String printTask() {
    return description;
  }
}

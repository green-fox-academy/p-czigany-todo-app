import java.nio.file.Paths;

/**
 * Created by peter on 2017.04.06..
 */
public class App {

  public static void main(String[] args) {
    ToDoList list = new ToDoList();
    if (args.length == 0) {
      list.printFile(Paths.get("../assets/userinfo.txt"));
    }
  }
}

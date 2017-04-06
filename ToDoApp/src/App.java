import java.nio.file.Paths;

/**
 * Created by peter on 2017.04.06..
 */
public class App {

  public static void main(String[] args) {
    ArgumentHandler handler = new ArgumentHandler(args);
    ToDoList list = new ToDoList();
    if (args.length == 0) {
      list.printUserInfo(Paths.get("../assets/userinfo.txt"));
    } else if (handler.contains("l")) {
      list.printList(Paths.get("../assets/data.txt"));
    }
  }
}

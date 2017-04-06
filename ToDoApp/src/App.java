import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by peter on 2017.04.06..
 */
public class App {

  public static void main(String[] args) {
    ArgumentHandler handler = new ArgumentHandler(args);
    ToDoList list = new ToDoList();
    Path listFile = Paths.get("../assets/data.txt");
    if (args.length == 0) {
      list.printUserInfo(Paths.get("../assets/userinfo.txt"));
    } else if (handler.contains("-l")) {
      list.printList(listFile);
    } else if (handler.contains("-a")) {
      list.printLineToFile(listFile, handler.getTask());
    }
  }
}

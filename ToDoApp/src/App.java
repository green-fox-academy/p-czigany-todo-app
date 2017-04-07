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
    Path userInfoFile = Paths.get("../assets/userinfo.txt");
    if (args.length == 0) {
      list.printUserInfo(userInfoFile);
    } else if (args[0].equals("-l")) {
      list.printList(listFile);
    } else if (args[0].equals("-a")) {
      list.addTask(listFile, handler.getTask());
    } else if (args[0].equals("-r")) {
      list.removeTask(listFile, handler.getTask());
    } else if (args[0].equals("-c")) {
      list.checkTask(listFile, handler.getTask());
    } else {
      System.out.println("\n  Unsupported argument...");
      list.printUserInfo(userInfoFile);
    }
  }
}

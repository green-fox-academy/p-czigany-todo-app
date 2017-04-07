import java.nio.file.Paths;
import java.util.List;

/**
 * Created by peter on 2017.04.07..
 */
public class App {

  public static void main(String[] args) {
    UserInfo userInfo = new UserInfo(Paths.get("../assets/userinfo.txt"));
    if (args.length == 0) {
      userInfo.printUserInfo();
    } else {
      if (args[0].equals("-l")) {

        List<String> lines = FileHandler.readFromFile(Paths.get("../assets/data.txt"));
        ToDoList taskList = new ToDoList();
        for (String line :
                lines) {
          taskList.addTask(new ToDo(line));
        }

        System.out.println(taskList.printList());
      }
    }
  }
}

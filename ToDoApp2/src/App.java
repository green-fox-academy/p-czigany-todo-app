import java.nio.file.Paths;

/**
 * Created by peter on 2017.04.07..
 */
public class App {

  public static void main(String[] args) {
    UserInfo userInfo = new UserInfo(Paths.get("../assets/userinfo.txt"));
    if (args.length == 0) {
      userInfo.printUserInfo();
    } else {
      ToDoList taskList = new ToDoList(Paths.get("../assets/data.txt"));
      if (args[0].equals("-l")) {
        System.out.println(taskList.printList());
      } else {
        if (args[0].equals("-a")) {
          taskList.newTaskFromInput(args);
        }
        taskList.listToFile(Paths.get("../assets/data.txt"));
      }
    }
  }
}

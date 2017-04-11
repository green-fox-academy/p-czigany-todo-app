import java.nio.file.Path;
import java.util.List;

/**
 * Created by peter on 2017.04.07..
 */
public class UserInfo {

  Path userInfoFile;

  public UserInfo(Path userInfoFile) {
    this.userInfoFile = userInfoFile;
  }

  public void printUserInfo() {
    FileHandler handler = new FileHandler();
    System.out.println();
    List<String> fileLines = handler.readFromFile(userInfoFile);
    for (int i = 0; i < fileLines.size(); i++) {
      System.out.println(fileLines.get(i));
    }
    System.out.println();
  }
}

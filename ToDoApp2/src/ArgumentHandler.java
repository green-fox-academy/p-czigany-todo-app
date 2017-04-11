/**
 * Created by peter on 2017.04.07..
 */
public class ArgumentHandler {

  String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  public String inputTask() {
    String task = "";
    for (int i = 1; i < args.length; i++) {
      task += args[i];
      if (i < args.length - 1) {
        task += " ";
      }
    }
    return task;
  }
}

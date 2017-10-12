package ninetynineproblems.lists;

import java.util.List;
import java.util.NoSuchElementException;

public class P01 {

  public static String last(List<String> list) {
    if (list == null || list.isEmpty()) {
      throw new NoSuchElementException();
    }
    if (list.size() == 1) {
      return list.get(0);
    }
    return last(list.subList(1, list.size()));
  }
}

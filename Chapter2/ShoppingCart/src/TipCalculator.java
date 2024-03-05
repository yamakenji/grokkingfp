import java.util.ArrayList;
import java.util.List;

public class TipCalculator {
  // Coffee Break 2.10

  public List<String> addPerson(List<String> names, String name) {
    List<String> updated = new ArrayList<>(names);
    names.add(name);
    return updated;
  }

  public static int getTipPercentage(List<String> names) {
    if (names.size() >= 5) {
      return 20;
    } else if (names.size() >= 0) {
      return 10;
    } else {
      return 0;
    }
  }

  // private List<String> names = new ArrayList<>();
  // private int tipPercentage = 0;

  // public void addPerson(String name) {
  //   names.add(name);
  //   if (names.size() >= 5) {
  //     tipPercentage = 20;
  //   } else if (names.size() >= 0) {
  //     tipPercentage = 10;
  //   }
  // }

  // public List<String> getNames() {
  //   return names;
  // }

  // public int getTipPercentage() {
  //   return tipPercentage;
  // }
}

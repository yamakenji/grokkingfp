// import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  // 2.7
  public static int getDiscountPercentage(List<String> items) {
    if (items.contains("Book")) {
      return 5;
    } else {
      return 0;
    }
  }

  // private List<String> items = new ArrayList();
  // // private boolean bookAdded = false;

  // public void addItem(String item) {
  //   items.add(item);
  //   // if (item.equals("Book")) {
  //   //   bookAdded = true;
  //   // }
  // }

  // public int getDiscountPercentage() {
  //   // if (bookAdded) {
  //   //   return 5;
  //   // } else {
  //   //   return 0;
  //   // }

  //   // 2.6
  //   if (items.contains("Book")) {
  //     return 5;
  //   } else {
  //     return 0; 
  //   }
  // }

  // public List<String> getItems() {
  //   // return items;

  //   // This is a defensive copy
  //   // Chapter 2.4
  //   return new ArrayList<>(items);
  // }

  // public void removeItem(String item) {
  //   items.remove(item);
  //   // if (item.equals("Book")) {
  //   //   bookAdded = false;
  //   // }
  // }

}

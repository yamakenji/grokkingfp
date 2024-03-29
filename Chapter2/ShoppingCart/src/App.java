import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // ShoppingCart cart = new ShoppingCart();
        // cart.addItem("Apple");
        // System.out.println(cart.getDiscountPercentage());

        // cart.addItem("Book");
        // System.out.println(cart.getDiscountPercentage());

        List<String> items = new ArrayList<>();
        items.add("Apple");
        System.out.println(ShoppingCart.getDiscountPercentage(items));

        items.add("Book");
        System.out.println(ShoppingCart.getDiscountPercentage(items));

        List<String> names = new ArrayList<>();
        names.add("Alice");
        System.out.println(TipCalculator.getTipPercentage(names));

        names.addAll(Arrays.asList("Bob", "Charlie", "Dave", "Eve","Kenji"));
        System.out.println(TipCalculator.getTipPercentage(names));

    }
}

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("Apple");
        System.out.println(ShoppingCart.getDiscountPercentage(items));

        items.add("Book");
        System.out.println(ShoppingCart.getDiscountPercentage(items));

        List<String> names = new ArrayList<>();
        System.out.println(TipCalculator.getTipPercentage(names));
        names.add("Kenji");
        names.add("Ayako");
        names.add("Risa");
        System.out.println(TipCalculator.getTipPercentage(names));
        names.add("Mako");
        names.add("Taro");
        names.add("Hanako");
        System.out.println(TipCalculator.getTipPercentage(names));
    }
}
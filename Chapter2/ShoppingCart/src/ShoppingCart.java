import java.util.List;

public class ShoppingCart {
    public static int getDiscountPercentage(List<String> items) {
        if (items.contains("Book")) {
            return 5;
        } else {
            return 0;
        }
    }
}

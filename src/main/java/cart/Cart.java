package cart;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();
    private DiscountStrategy discountStrategy;

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getPrice();
        }
        return discountStrategy != null ? discountStrategy.applyDiscount(total) : total;
    }
}

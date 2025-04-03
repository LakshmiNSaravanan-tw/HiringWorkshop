package cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
     private static ShoppingCart instance; // The single instance
     private DiscountStrategy discountStrategy;
     private List<CartItem> items; // List to store cart items

    // Private constructor to prevent direct instantiation
    private ShoppingCart() {
        items = new ArrayList<>();
    }

    // Public method to provide access to the single instance (Thread-safe)
    public static synchronized ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    // Add item to cart
    public void addItem(CartItem item) {
        items.add(item);
    }

    // Remove item from cart
    public void removeItem(CartItem item) {
        items.remove(item);
    }

    // Display cart items
    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Shopping Cart:");
        for (CartItem item : items) {
            System.out.println("- " + item.getName() + " ($" + item.getPrice() + ")");
        }
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }

    public double calculateTotal() {
        double total = items.stream().mapToDouble(CartItem::getPrice).sum();
        return (discountStrategy != null) ? discountStrategy.applyDiscount(total) : total;
    }
    
}

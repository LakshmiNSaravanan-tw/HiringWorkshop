import cart.*;
import orders.*;

public class MainClass {
    public static void main(String[] args) {
        // Create Cart and Apply Discount
        Cart cart = new Cart();
        cart.addItem(new CartItem("Laptop", 1000));
        cart.setDiscountStrategy(new PercentageDiscount(10)); // 10% Discount
        System.out.println("Total after discount: $" + cart.calculateTotal());

        // Create an Order and Add Observers
        Order order = new Order();
        order.addObserver(new EmailNotificationObserver());
        order.addObserver(new InventoryObserver());
        order.placeOrder();
    }
}

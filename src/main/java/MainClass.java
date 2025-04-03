import cart.*;
import orders.*;
import users.*;

public class MainClass {
    public static void main(String[] args) {


        User customer = new Customer("Alice", "alice@example.com", "cust123");
        User admin = new Admin("Bob", "bob@example.com", "admin@pass");
        User vendor = new Vendor("Charlie", "charlie@example.com", "vend456");

        System.out.println("Customer Authentication: " + customer.authenticateUser("cust123")); // true
        System.out.println("Admin Authentication: " + admin.authenticateUser("admin@pass")); // true (OTP verified)
        System.out.println("Vendor Authentication: " + vendor.authenticateUser("wrongpass")); // false




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

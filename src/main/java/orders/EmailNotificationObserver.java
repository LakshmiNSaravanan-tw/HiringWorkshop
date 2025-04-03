package orders;

public class EmailNotificationObserver implements OrderObserver {
    @Override
    public void update() {
        System.out.println("Sending email notification for order...");
    }
}

package orders;

public class InventoryObserver implements OrderObserver {
    @Override
    public void update() {
        System.out.println("Updating inventory after order placement...");
    }
}

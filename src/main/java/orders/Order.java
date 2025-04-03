package orders;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void placeOrder() {
        System.out.println("Order placed!");
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update();
        }
    }
}

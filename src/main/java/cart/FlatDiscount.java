package cart;

public class FlatDiscount implements DiscountStrategy {
    private double discountAmount;

    public FlatDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount - discountAmount;
    }
}

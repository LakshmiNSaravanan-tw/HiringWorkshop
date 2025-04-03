package products;

public class ProductFactory {
    public static Product createProduct(String type, String name, double price) {
        switch (type.toLowerCase()) {
            case "electronic":
                return new ElectronicProduct(name, price);
            case "clothing":
                return new ClothingProduct(name, price);
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}

class ElectronicProduct extends Product {
    public ElectronicProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Electronic Product: " + name + ", Price: $" + price);
    }
}

class ClothingProduct extends Product {
    public ClothingProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Clothing Product: " + name + ", Price: $" + price);
    }
}

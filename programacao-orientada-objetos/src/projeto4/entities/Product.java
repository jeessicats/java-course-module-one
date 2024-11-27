package projeto4.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(int quantity, String name, double price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock () {
        return price * quantity;
    }

    public void addProductToStock (int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void subtractProductFromStock (int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}

package pack2;

import java.util.HashMap;
import java.util.Map.Entry;

class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', quantity=" + quantity + ", price=" + price + "}";
    }
}

class InventoryManager {
    private HashMap<String, Product> inventory = new HashMap<>();

    // Method to add or update a product in the inventory
    public void addOrUpdateProduct(String productCode, String name, int quantity, double price) {
        Product product = inventory.get(productCode);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            product = new Product(name, quantity, price);
            inventory.put(productCode, product);
            System.out.println("Product added: " + product);
        }
    }

    // Method to remove a product from the inventory
    public void removeProduct(String productCode) {
        Product removedProduct = inventory.remove(productCode);
        if (removedProduct != null) {
            System.out.println("Product removed: " + removedProduct);
        } else {
            System.out.println("Product code not found.");
        }
    }

    // Method to display the current inventory
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("Current inventory:");
            for (Entry<String, Product> entry : inventory.entrySet()) {
                System.out.println("Product Code: " + entry.getKey() + ", " + entry.getValue());
            }
        }
    }
public class Question2B {

	public static void main(String[] args) {
		InventoryManager manager = new InventoryManager();
		manager.addOrUpdateProduct("P001", "Product1", 10, 100.0);
        manager.addOrUpdateProduct("P002", "Product2", 20, 150.0);
        manager.addOrUpdateProduct("P003", "Product3", 30, 200.0);
        manager.addOrUpdateProduct("P004", "Product4", 40, 250.0);
        manager.addOrUpdateProduct("P005", "Product5", 50, 300.0);

        // Displaying the inventory
        manager.displayInventory();

        // Removing 2 products from the inventory
        manager.removeProduct("P002");
        manager.removeProduct("P004");

        // Displaying the inventory after removal
        manager.displayInventory();
    }
}
}

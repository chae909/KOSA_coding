package kosa.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayCartContents() {
        if (products.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Cart Contents:");
        for (Product product : products) {
            product.show();
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.discountApply();
        }
        return total;
    }
}
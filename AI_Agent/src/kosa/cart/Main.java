public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product[] products = {
            new NoteBook(1, "Notebook A", 1000, 10),
            new Phone(2, "Phone B", 500, 5)
        };

        System.out.println("Available Products:");
        for (Product product : products) {
            product.show();
        }

        // Example of adding products to the cart
        cart.addProduct(products[0]);
        cart.addProduct(products[1]);

        // Display cart contents
        cart.displayCart();
        System.out.println("Total Price: " + cart.calculateTotal());
    }
}
package interfaces.test;

import interfaces.classes.Product;

public class ProductTest {
    public static void main(String[] args) {
        Product p = new Product("Book", 60, 50);
        p.calculateTaxa();
        System.out.println(p);
    }
}

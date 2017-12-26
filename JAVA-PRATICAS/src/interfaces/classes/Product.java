package interfaces.classes;

/**
 * --Created by Diogo Duarte on 28/12/2017
 * --Practicing Interfaces
 * NOTES:
 * -It's a collection of abstract methods
 * -May also contain constants, default methods, static methods, and nested types.
 */

public class Product implements Taxable {
    private String name;
    private double price;
    private double amountPrice;
    private double weight;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
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

    public double getAmountPrice() {
        return amountPrice;
    }

    public void setAmountPrice(double amountPrice) {
        this.amountPrice = amountPrice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void calculateTaxa(){
        this.amountPrice = this.price + this.price * TAXA + this.weight * TAXA;
     }

    @Override
    public String toString() {
        return "Product: " +
                "name = '" + name + '\'' +
                ",   Price = " + amountPrice;
    }
}

package finalmodifier.classes;
/**
 * @autor Diogo Duarte
 * data: 28/11/2017
 * Final modifier
 */
public class Car {
    private String name;
    private String brand;
    private static final double FINAL_SPEED = 200;

    public Car(){}
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

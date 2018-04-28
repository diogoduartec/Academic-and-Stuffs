package staticmodifier.tests;
import staticmodifier.classes.Car;
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 250);
        Car c2 = new Car("Audi", 280);
        Car c3 = new Car("Mercedez", 275);
        c1.print();
        c2.print();
        c3.print();
        System.out.println("####################################");
        c1.print();
        c2.print();
        c3.print();
    }
}

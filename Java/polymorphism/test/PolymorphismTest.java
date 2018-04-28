package polymorphism.test;

import polymorphism.classes.Employee;
import polymorphism.classes.Manager;
import polymorphism.classes.PaymentRecord;
import polymorphism.classes.Seller;

public class PolymorphismTest {
    public static void main(String[] args) {
        Manager m = new Manager("Nathalya", 4500.00, 700.00);
        Seller s = new Seller("William", 2000.00, 18000.00);
        PaymentRecord pr = new PaymentRecord();
        pr.paymentRecord(m);
        System.out.println("------------------------------------------------------");
        pr.paymentRecord(s);
    }
}

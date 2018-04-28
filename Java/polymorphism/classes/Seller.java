package polymorphism.classes;

public class Seller extends Employee{
    private double salesAmount;
    public Seller(String name, double salary, double salesAmount) {
        super(name, salary);
        this.salesAmount = salesAmount;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    @Override
    public void calculatePayment() {
        this.salary += salesAmount*0.1;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

}

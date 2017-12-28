package polymorphism.classes;

public class Manager extends Employee {
    private double profitSharing;

    public Manager(String name, double salary, double profitSharing) {
        super(name, salary);
        this.profitSharing = profitSharing;
    }

    public double getProfitSharing() {
        return profitSharing;
    }

    @Override
    public void calculatePayment() {
        this.salary += profitSharing;
    }

    public void setProfitSharing(double profitSharing) {
        this.profitSharing = profitSharing;
    }
}

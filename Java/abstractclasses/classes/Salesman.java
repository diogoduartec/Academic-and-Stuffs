package abstractclasses.classes;

public class Salesman extends Employee {
    private double salesAmount;
    @Override
    public void calculateSalary(){
        this.salary += salesAmount * 0.05;
    }
    public Salesman() {

    }
    public Salesman(String name, String clt, double salary, double salesAmount) {
        super(name, clt, salary);
        this.salesAmount = salesAmount;
    }
    public double getSalesAmount() {
        return salesAmount;
    }
    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

}

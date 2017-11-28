package inheritance.classes;
/**
 * @autor Diogo Duarte
 * data: 21/11/2017
 * Introduction to inheritance
 */
public class Employee extends Person{
    private double salary;

    public void print(){
        super.print();
        System.out.println("Salary:"+this.salary);
    }
    public void printReceiptOfPayment(){
        System.out.println("I "+super.name+" got "+this.salary);
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

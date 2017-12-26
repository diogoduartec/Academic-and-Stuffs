package abstractclasses.classes;

/**
 * --Created by Diogo Duarte on 21/12/2017.
 * --Practicing abstract classes.
 * OBS:
 * -Abstract classes can not be instantiated, but they can be subclassed.
 * -It may or may not include abstract methods.
 */
public abstract class Employee {
    protected String name;
    protected String clt;
    protected double salary;

    public abstract void calculateSalary();

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", clt='" + clt + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, String clt, double salary) {
        this.name = name;
        this.clt = clt;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

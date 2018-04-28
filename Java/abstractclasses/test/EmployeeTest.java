package abstractclasses.test;

import abstractclasses.classes.Employee;
import abstractclasses.classes.Manager;
import abstractclasses.classes.Salesman;

public class EmployeeTest {
    public static void main(String[] args) {
        Salesman s = new Salesman("Rebecca", "1235421", 2000, 5000);
        Manager m = new Manager("Louiza", "123465654", 5000);
        s.calculateSalary();
        m.calculateSalary();
        System.out.println(s);
        System.out.println(m);
    }

}

package inheritance.tests;

import inheritance.classes.Employee;
import inheritance.classes.Person;
import inheritance.classes.Address;
public class InheritanceTest {
    public static void main(String[] args) {
        Person person = new Person("Willian", "032.025.250-58");
        Address address = new Address("Abc123", "New Atlantha", 125);
        Employee employee = new Employee("Marcelus");
        employee.setName("William");
        employee.setSalary(3500);
        employee.setCpf("032.035.032-88");
        employee.setAddress(address);
        employee.print();
    }
}

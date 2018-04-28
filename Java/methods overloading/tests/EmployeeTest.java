package sobrecargametodos.tests;
import sobrecargametodos.classes.Employee;
public class EmployeeTest {
    public static void main(String... args){
        Employee funcionario = new Employee();

        funcionario.init("Mario de Andrade", "111.222.333-54", 4600, "112.555-56");
        funcionario.print();
    }
}

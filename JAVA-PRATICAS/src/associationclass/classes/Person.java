package associationclass.classes;
/**
 * Date 17/11/2017
 * @autor Diogo Duarte
 * Practicing class association
 */

public class Person {
    private Department department;
    private Adress adress;

    public Person(Department department, Adress adress) {
        this.department = department;
        this.adress = adress;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}

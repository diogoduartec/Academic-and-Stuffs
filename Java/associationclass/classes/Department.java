package associationclass.classes;
/**
 * Date 17/11/2017
 * @autor Diogo Duarte
 * Practicing class association
 */
public class Department {
    private Person[] person;

    public Department(Person[] person) {
        this.person = person;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }
}

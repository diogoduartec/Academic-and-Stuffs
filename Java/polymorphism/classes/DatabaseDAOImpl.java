package polymorphism.classes;

public class DatabaseDAOImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Saving data to the Database");
    }
}

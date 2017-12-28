package polymorphism.classes;

public class ArchiveDAOImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Saving data to the archive");
    }
}

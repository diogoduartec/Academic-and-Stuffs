package polymorphism.test;

import polymorphism.classes.ArchiveDAOImpl;
import polymorphism.classes.DatabaseDAOImpl;
import polymorphism.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO archiveDAO = new ArchiveDAOImpl();
        archiveDAO.save();
        archiveDAO = new DatabaseDAOImpl();
        archiveDAO.save();
    }
}

package enumtype.test;
import enumtype.classes.Client;
import enumtype.classes.TypeClient;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Mario Andrade", TypeClient.NATURAL_PERSON, Client.TypePayment.BY_CHECK);
        System.out.println(client);
    }
}

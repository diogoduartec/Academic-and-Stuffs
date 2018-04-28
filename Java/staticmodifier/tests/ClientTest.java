package staticmodifier.tests;
import blocodeinicializacao.classes.Client;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client();
        for(int i : client.getPlots()) System.out.print(i+" ");
    }
}

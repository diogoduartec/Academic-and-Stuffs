package exception.checkedexception.classes;

public class Reader2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing Reader2");
    }
}

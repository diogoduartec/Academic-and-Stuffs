package exception.checkedexception.classes;

public class Reader1 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("closing reader 1");
    }
}

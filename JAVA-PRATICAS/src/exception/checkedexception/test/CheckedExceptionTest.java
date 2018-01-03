package exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            createFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void createFile() throws IOException{
        File file = new File("test.txt");
        try{
            file.createNewFile();
            System.out.println("OK");
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}

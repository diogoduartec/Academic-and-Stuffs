package exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        openFile();
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
    public static void openFile(){
        File file = new File("test.txt");
        try{
            System.out.println("Loading file");
            System.out.println("Running file");
            System.out.println("Write file");

        } catch (Exception e){
            e.printStackTrace();
            throw e;
        } finally {
            System.out.println("Finish");
        }
    }
}

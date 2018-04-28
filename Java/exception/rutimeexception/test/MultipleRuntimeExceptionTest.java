package exception.rutimeexception.test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * Create by Diogo Duarte in 05/01/2018
 * practicing Multiple Runtime Exception in java 6
 */
public class MultipleRuntimeExceptionTest {
    public static void main(String... args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Not possible");
        }
        try {
            maybeThrowException();
        } catch(Exception e){
            System.out.println("Not possible");
        }
    }

    private static void maybeThrowException() throws SQLException, AWTException, FileNotFoundException{
    }
}

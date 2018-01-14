/**
 * By Diogo Diogo Duarte, 14/01/2018
 * Practicing New IO(NIO)
 * How to use normalize
 */
package nio.test;

import java.io.IOException;
import java.nio.file.*;

public class NormalizingTest {
    public static void main(String... args){
        Path directoryPath = Paths.get("folder\\home\\diogo\\dev");
        Path archivePath = Paths.get("../../../archive-test.txt");
        Path normalized = Paths.get(directoryPath.toString(), archivePath.toString());
        normalized=normalized.normalize();
        try {
            if(Files.notExists(normalized))
                Files.createFile(normalized);
            //Files.deleteIfExists(normalized);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(normalized.toAbsolutePath());
    }
}

package nio.test;

import java.nio.file.*;

public class RelativizingTest {
    public static void main(String[] args) {
        Path directoryPath = Paths.get("home/diogo");
        Path archivePath = Paths.get("home/diogo/dev/newDir/file.txt");
        Path pathToClass = directoryPath.relativize(archivePath);
        System.out.println(pathToClass);
    }
}

package nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class ResolvingPath {
    public static void main(String... args){
        Path directoryPath = Paths.get("folder");
        Path archivePath = Paths.get("file.txt");
        Path result  = directoryPath.resolve(archivePath);
        System.out.println(result.toAbsolutePath());

        directoryPath = Paths.get("folder\\home\\diogo\\dev");
        archivePath = directoryPath.resolve(archivePath);
        try {
            Files.createDirectories(directoryPath);
            Files.createDirectory(archivePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path absolute = Paths.get("folder/home/diogo");
        Path relative = Paths.get("dev");
        Path file = Paths.get("file.tex");

        System.out.println(""+absolute.resolve(relative));
        System.out.println(""+absolute.resolve(file));
        System.out.println(""+relative.resolve(file));
        System.out.println(""+relative.resolve(absolute));
        System.out.println(""+file.resolve(absolute));
        System.out.println(""+file.resolve(relative));

    }
}

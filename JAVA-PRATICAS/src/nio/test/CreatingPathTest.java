/**
 * By Diogo Diogo Duarte, 14/01/2018
 * Practicing New IO(NIO)
 */

package nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.ExecutionException;

public class CreatingPathTest {
    public static void main(String... args){
        //Path path1 = Paths.get("C:\\Users\\Windows7\\Documents\\local\\academic\\JAVA-PRATICAS\\test.txt");
        //Path path2 = Paths.get("C:","Users","Windows7","Documents","local","academic","JAVA-PRATICAS","test.txt");
        //System.out.println(path1.toAbsolutePath());
        //System.out.println(path2.toAbsolutePath());

        Path path1 = Paths.get("path");
        Path path2 = Paths.get("path\\subpath\\subsubpath\\");
        Path archive = Paths.get("path\\subpath\\subsubpath\\archive.txt");
        try{
            //if(Files.notExists(path1))
                //Files.createDirectory(path1);
            if(Files.notExists(path2))
                Files.createDirectories(path2);
            if(Files.notExists(archive))
                Files.createFile(archive);

        }catch (IOException e){
            e.printStackTrace();
        }
        Path source = Paths.get("folder\\archive.txt");
        Path target = Paths.get(path2.toString()+"\\archiveCopied.txt");

        try {
            //Files.copy(source, target);
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            Files.deleteIfExists(target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package nio.test;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

class FindAllBkp extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if(file.getFileName().toString().endsWith(".bkp"))
            System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class FileVisitorTest {
    public static void main(String[] args) throws IOException{
        Files.walkFileTree(Paths.get("folder"), new FindAllBkp());
    }
}

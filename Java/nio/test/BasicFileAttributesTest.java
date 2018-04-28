package nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BasicFileAttributesTest{
    public static void main(String[] args) throws IOException {
        Date date = new GregorianCalendar(2015, Calendar.DECEMBER, 2).getTime();
        File file = new File("folder/new-file.text");
        file.createNewFile();
        file.setLastModified(date.getTime());
        System.out.println("Last modified of file: "+file.lastModified());
        file.deleteOnExit();


        Path path = Paths.get("folder/file.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(date.getTime());
        Files.setLastModifiedTime(path,fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);


        path = Paths.get("C:\\Users\\Windows7\\Documents\\local\\academic\\JAVA-PRATICAS\\src\\exercicios\\associationsclassexercises\\javaclass\\Address.java");
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));


        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(basicFileAttributes.creationTime());
        System.out.println(basicFileAttributes.lastAccessTime());
        System.out.println(basicFileAttributes.lastModifiedTime());
        System.out.println(basicFileAttributes.isRegularFile());

        FileTime lastModified = basicFileAttributes.lastModifiedTime();
        FileTime created = basicFileAttributes.creationTime();
        FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);

        basicView.setTimes(lastModified,lastAcess,created);

        basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("create "+ basicFileAttributes.creationTime());
        System.out.println("lastAccess "+ basicFileAttributes.lastAccessTime());
        System.out.println("LastModified "+ basicFileAttributes.lastModifiedTime());

    }
}

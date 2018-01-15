package nio.test;
import java.nio.file.*;
import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest{
    public static void main(String[] args){
        Path path = Paths.get("folder_test.txt");
        try{
            Files.createFile(path);
            Files.setAttribute(path,"dos:hidden",true);
            Files.setAttribute(path,"dos:readonly",true);
            DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);

            System.out.println(dos.isReadOnly());
            System.out.println(dos.isHidden());

            //Files.setAttribute(path,"dos:hidden",false);
            //Files.setAttribute(path,"dos:readonly",false);
            DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);
            dosView.setHidden(false);
            dosView.setReadOnly(false);
            dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isReadOnly());
            System.out.println(dos.isHidden());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
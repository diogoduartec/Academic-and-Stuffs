package io.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Archive.txt");
        try{
            System.out.println("created? "+file.createNewFile());
            System.out.println("exists? " +file.exists());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
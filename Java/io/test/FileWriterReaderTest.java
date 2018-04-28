package io.test;

import java.io.*;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Archive.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("writing in the archive");
            fileWriter.flush();
            fileWriter.close();

            char[] in = new char[500];
            //FileReader fileReader = new FileReader(file, true); ---> second argument is true if i want to make append
            FileReader fileReader = new FileReader(file);
            int size = fileReader.read(in);
            System.out.println("size: "+size);
            for(char c : in){
                System.out.print(c);
            }
            System.out.println("");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

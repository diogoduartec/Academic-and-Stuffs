package io.test;

import java.io.*;

public class BufferedTest {
    public static void main(String... args){
        File file = new File("Archive.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("writing in the archive");
            bufferedWriter.newLine();
            bufferedWriter.write("new line");

            bufferedWriter.flush();
            bufferedWriter.close();

            char[] in = new char[500];
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s = null;
            while((s=bufferedReader.readLine())!=null){
                System.out.println(s);
            }
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

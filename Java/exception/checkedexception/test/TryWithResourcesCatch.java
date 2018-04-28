package exception.checkedexception.test;

import exception.checkedexception.classes.Reader1;
import exception.checkedexception.classes.Reader2;

import java.io.*;

public class TryWithResourcesCatch {
    public static void main(String... args){
        readFile();
    }

    public static void readFile(){
        try(Reader1 reader1 = new Reader1();
            Reader2 reader2 = new Reader2();){
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFileOld(){//Java 6
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if(reader!=null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

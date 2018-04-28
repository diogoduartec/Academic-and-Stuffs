package collections.test;

import java.util.List;
import java.util.ArrayList;

import collections.classes.Cellphone;

public class ListCellphoneTest{
    public static void main(String... args){
        Cellphone cellphone1 = new Cellphone("ione", "123541");
        Cellphone cellphone2 = new Cellphone("Galaxy", "127314");
        Cellphone cellphone3 = new Cellphone("Z1", "122151");
        List<Cellphone> cellphoneList = new ArrayList<>();
        cellphoneList.add(cellphone1);
        cellphoneList.add(cellphone2);
        cellphoneList.add(cellphone3);
        cellphoneList.forEach(System.out::println);
    }
}
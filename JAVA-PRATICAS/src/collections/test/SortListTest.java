package collections.test;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import collections.classes.Cellphone;

public class SortListTest{
    public static void main(String... args){
        List<String> names = new ArrayList<>();
        names.add("Diogo Duarte");
        names.add("Marcelus");
        names.add("Vicent");
        names.add("Suzana");
        names.add("Jhon");
        names.forEach(System.out::println);
        Collections.sort(names);
        System.out.println("###SORTED###");
        names.forEach(System.out::println);
    }
}
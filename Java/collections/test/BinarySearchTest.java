package collections.test;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class BinarySearchTest{
    public static void main(String... args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        //numbers.add(1);
        //insertion point -1
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers,4));
    }
}


package collections.test;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class ConvertArrayListTest{
    public static void main(String... args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        Integer[] numbersArray = new Integer[numbers.size()];
        numbers.toArray(numbersArray);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbersArray));

        System.out.println("----------------------------------");

        Integer[] numbersArray2 = new Integer[4];
        numbersArray2[0] = 10;
        numbersArray2[1] = 9;
        numbersArray2[2] = 8;
        numbersArray2[3] = 7;
        List<Integer> numbers2 = Arrays.asList(numbersArray2);
        System.out.println(Arrays.asList(numbersArray2));
        System.out.println(numbers2);

    }
}

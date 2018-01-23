/**
 * By Diogo Duarte on 16/01/2018
 * Collections
 * Practicing List and hashCode
 */
package collections.test;

import java.util.List;
import java.util.ArrayList;

// is not possible make list of primitives

public class ListTest{
    public static void main(String... args){
        List<String> names = new ArrayList<>(); // Java 4
        names.add("Diogo");
        names.add("dev");
        names.add("Java 8");

        /**
         *JAVA 7 foreach
         for(String name : names){
         System.out.println(name);
         }
         */

        /**JAVA 8 foreach*/
        names.forEach(System.out::println);

        for(int i=0; i<100; i++) names.add("Diogo");
        //names.forEach(System.out::println);
        //System.out.println(names.size());
        for(int i=names.size()-1; i>3; i--){
            names.remove(names.get(i).toString());
        }
        names.remove(0);
        names.remove("dev");
        //names.forEach(System.out::println);
        names.clear();
    }
}

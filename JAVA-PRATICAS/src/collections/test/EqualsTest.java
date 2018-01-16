/**
 * By Diogo Duarte on 16/01/2018
 * Collections
 * Practicing equals and hashCode
 */
package collections.test;

import collections.classes.Cellphone;
/**
 * By Diogo Duarte on 16/01/2018
 * Collections
 * Practicing equals and hashCode
 */
public class EqualsTest {
    public static void main(String... args){
        String name1 = "Diogo Duarte";
        String name2 = new String("Diogo Duarte");
        // name1 != name2
        Integer int1 = 5;
        Integer int2 = new Integer(5);
        System.out.println(name1.equals(name2));
        System.out.println(int1.equals(5));

        Cellphone cellphone1 = new Cellphone("iphoneA", "1234X");
        Cellphone cellphone2 = new Cellphone("iphoneB", "1234X");
        System.out.println(cellphone1.equals(cellphone2));
        System.out.println(cellphone1.hashCode()+" - "+cellphone2.hashCode());
    }
}
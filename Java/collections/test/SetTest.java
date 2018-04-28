package collections.test;
/**
 * created by Diogo Duarte on 22/01/2018
 * practicing Set
 */

import collections.classes.Product;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetTest{
    public static void main(String... args){
        //Set<Product> productSet = new HashSet<>();
        Set<Product> productSet = new LinkedHashSet<>();//ordered version
        productSet.add(new Product("213", "notebook lenovo", 2.500));
        productSet.add(new Product("211", "notebook vaio", 3.888));
        productSet.add(new Product("118", "smartphone apple", 3.500));
        productSet.add(new Product("154", "tv sony", 2.700));
        productSet.add(new Product("210", "tv lenovo", 2.154));
        productSet.add(new Product("210", "tv lenovo", 2.154));
        Product product = new Product("210", "tv lenovo", 2.154);
        productSet.add(product);
        productSet.add(product);

        productSet.forEach(System.out::println);

    }
}

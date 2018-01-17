package collections.test;

import java.util.Collections;
import collections.classes.Product;
import java.util.List;
import java.util.ArrayList;


public class SortProductTest {
    public static void main(String... args){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("213", "notebook lenovo", 2.500));
        productList.add(new Product("211", "notebook vaio", 3.888));
        productList.add(new Product("118", "smartphone apple", 3.500));
        productList.add(new Product("154", "TV sony", 2.700));
        productList.add(new Product("210", "Ty lenovo", 2.154));

        Collections.sort(productList);
        productList.forEach(System.out::println);
    }
}

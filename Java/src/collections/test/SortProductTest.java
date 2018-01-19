package collections.test;

import java.util.Collections;
import collections.classes.Product;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2){
        return product1.getName().compareTo(product2.getName());
    }
}


public class SortProductTest {
    public static void main(String... args){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("213", "notebook lenovo", 2.500));
        productList.add(new Product("211", "notebook vaio", 3.888));
        productList.add(new Product("118", "smartphone apple", 3.500));
        productList.add(new Product("154", "tv sony", 2.700));
        productList.add(new Product("210", "tv lenovo", 2.154));
        Collections.sort(productList, new ProductNameComparator());
        productList.forEach(System.out::println);
    }
}

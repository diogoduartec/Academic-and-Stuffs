package collections.test;

import collections.classes.Product;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class IteratorTest{
    public static void main(String... args){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("213", "notebook lenovo", 2.500));
        productList.add(new Product("211", "notebook vaio", 3.888));
        productList.add(new Product("118", "smartphone apple", 3.500));
        productList.add(new Product("154", "tv sony", 2.700));
        productList.add(new Product("210", "tv lenovo", 2.154));
        Iterator<Product> productIterator = productList.iterator();

        while(productIterator.hasNext()){
            if(productIterator.next().getSerialNumber()=="213")
                productIterator.remove();
        }
        productList.forEach(System.out::println);
    }
}

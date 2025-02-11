package com.example.demo.product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    //List<Product> db = new ArrayList<>();
    Map<Integer, Product> db = new HashMap<>();
    //static Map<String, Product> products = new HashMap<>();


    public Product findProduct(int id) {
       // Product product = new Product(1,"mic",20000,"one two three");
        // return product;
        return db.get(id);
    }

    public void saveProduct(Product product) {
         db.put(1, product);
         System.out.println(product.toString());
         //db.add(product);
    }
}

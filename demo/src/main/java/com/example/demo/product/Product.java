package com.example.demo.product;

import com.example.demo.product.dto.ProductDto;

public class Product {
    private int id;
    private String name;
    private int price;
    private String description;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public Product(int id, String name, int price, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    private String name ;
 public ProductDto toDto(Product product) {
    return new ProductDto(product.getId(), product.getName(), product.getPrice(), product.getDescription());
}
}

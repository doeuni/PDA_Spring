package com.example.demo.product.dto;

import com.example.demo.product.Product;

public class ProductDto {
    private int id;
    private String name;
    private int price;
    private String description;

    public ProductDto() {
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

//    public void setPrice(int price) {
//        this.price = price;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductDto(int id, String name, int price, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }


    public Product toEntity() {
        return new Product(id, name, price, description);
    }
}

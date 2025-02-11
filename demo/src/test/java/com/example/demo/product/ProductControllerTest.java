package com.example.demo.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {

    @Test
    void findProduct() {
        ProductController productController = new ProductController();
//        productController.productService = new ProductBService();
//        //b서비스를 넣어줄쉬있는방법은 필드가아니라 새성상자주입바업으로바꿔주면가능
        productController.findProduct();
    }
}
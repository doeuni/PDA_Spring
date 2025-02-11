package com.example.demo.product;

import com.example.demo.product.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class ProductController {

    @Autowired
    private ProductService productService;
//    ProductService productService = new ProductService();

//    ProductController(){
//        productService = new ProductService();
//    }

//    ProductController(){
//        productService =
//    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public ProductDto findProduct(@PathVariable("id") int id) {
        //ProductService productService = new ProductService();
        return productService.findProductService(id);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void saveProduct(@RequestBody ProductDto productDto) {
        //ProductService productService = new ProductService();\
        //System.out.println(product.toString());
        productService.saveProduct(productDto);

    }
}

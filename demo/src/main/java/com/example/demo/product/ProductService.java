package com.example.demo.product;

import com.example.demo.product.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
   private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public String test() {
        return "";
    }

    //product(entity)로 -> ProductDto 변환 함
    public ProductDto findProductService(int id) {
        Product product = productRepository.findProduct(id);
        ProductDto productDto = product.toDto(product);

        return productDto;
    }



    //ProductDto -> product(entity)로 변환 함
    public void saveProduct(ProductDto productDto) {
        Product product = productDto.toEntity();
        //Product product = getProductFromDTO(productDto);
        productRepository.saveProduct(product);
    }


}

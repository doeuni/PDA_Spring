package com.example.demo.relation;

import com.example.demo.product.ProductService;
import com.example.demo.product.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RelationController {

    @Autowired
    RelationService relationService;

    //localhost:8080/jpa POST
    @PostMapping("/jpa")
    public void save() {
        Parent parent1 = new Parent("e","parent4");
        relationService.saveParent(parent1);

        Child child1 = new Child(5,"child4",parent1);
        relationService.saveChild(child1);
    }

    @GetMapping("/childs")
    public Child findChild(){
        return relationService.findChild();
    }
//    //parent
//    Parent parent1 = new Parent("d","parent4");
//        relationRepository.saveParent(parent1);
//    //child
//    Child child1 = new Child(4,"child4",parent1);
//        relationRepository.saveChild(child1);

}

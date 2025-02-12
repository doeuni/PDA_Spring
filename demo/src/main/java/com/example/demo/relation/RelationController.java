package com.example.demo.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RelationController {
    @Autowired
    RelationRepository relationRepository;

    //localhost:8080/jpa POST
    @PostMapping("/jpa")
    public void save() {
        //parent
        Parent parent1 = new Parent("d","parent4");
        relationRepository.saveParent(parent1);
        //child
        Child child1 = new Child(4,"child4",parent1);
        relationRepository.saveChild(child1);
    }
}

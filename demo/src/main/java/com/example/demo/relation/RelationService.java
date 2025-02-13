package com.example.demo.relation;

import com.example.demo.product.Product;
import com.example.demo.product.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RelationService {
    @Autowired
    RelationRepository relationRepository;

    @Transactional
    public void saveParent(Parent parent) {
        relationRepository.saveParent(parent);
    }

    @Transactional
    public void saveChild(Child child){
        relationRepository.saveChild(child);

    }

    public Child findChild(){
        return relationRepository.findChild();
    }


}

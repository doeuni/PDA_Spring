package com.example.demo.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RelationService {
    @Autowired
    RelationRepository relationRepository; //일케있는데 B레파지토fl리로 여기바꾸면 solid원칙 중

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

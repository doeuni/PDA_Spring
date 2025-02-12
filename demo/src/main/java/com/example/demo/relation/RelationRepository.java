package com.example.demo.relation;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RelationRepository {
    @Autowired
    EntityManager entityManager;

    //Entity 저장
    public void saveChild(Child child) {
        entityManager.persist(child);
    }

    public void saveParent(Parent parent){
        entityManager.persist(parent);
    }
}

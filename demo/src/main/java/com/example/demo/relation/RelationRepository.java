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

    //entityManger가 db랑 소통함.

    //child1의 정보를 parent이름 포함해서 출력 (Select)
    public Child findChild() {
        return entityManager.find(Child.class, 1);
    }

}

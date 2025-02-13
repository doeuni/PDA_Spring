package com.example.demo.relation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RelationBRepository
        extends JpaRepository<Child, Integer> {
    List<Child> findById(int i);
    List<Child> findByName(String name);


}

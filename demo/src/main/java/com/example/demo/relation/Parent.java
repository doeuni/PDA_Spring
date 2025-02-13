package com.example.demo.relation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Parent {
    @Id
    private String id;
    private String name;

    public Parent(){

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Parent(String id, String name){
        this.id = id;
        this.name =name;
    }
}

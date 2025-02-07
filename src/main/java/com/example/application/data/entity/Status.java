package com.example.application.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.application.data.AbstractEntity;

@Entity
@Table(name = "status")
public class Status extends AbstractEntity {
    private String name;

    public Status() { }

    public Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

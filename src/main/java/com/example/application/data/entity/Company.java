package com.example.application.data.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.example.application.data.AbstractEntity;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "company")
public class Company extends AbstractEntity {
    @NotBlank
    private String name;

    @OneToMany(mappedBy = "company")
    private List<Contact> employees = new LinkedList<>();

    @Formula("(select count(c.id) from contact c where c.company_id = id)")
    private int employeeCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Contact> employees) {
        this.employees = employees;
    }

    public int getEmployeeCount(){
        return employeeCount;
    }
}

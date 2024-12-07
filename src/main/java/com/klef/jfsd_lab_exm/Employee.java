package com.klef.jfsd_lab_exm;

import java.util.List;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private Boolean isPermanent;
    private List<String> skills;

    // Constructor for constructor-based injection
    public Employee(Integer id, String name, Double salary, Boolean isPermanent, List<String> skills) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.isPermanent = isPermanent;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", isPermanent=" + isPermanent + ", skills=" + skills + "]";
    }
}

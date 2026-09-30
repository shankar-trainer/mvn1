package com.example.model;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
 private int id;
 private String name;
 private LocalDate dob;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(dob, employee.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dob);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}

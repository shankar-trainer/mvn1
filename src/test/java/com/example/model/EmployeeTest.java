package com.example.model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EmployeeTest {

    Employee employee1,employee2;

    @BeforeEach
    public void init(){
        employee1=new Employee();
        employee2=new Employee();

        employee1.setId(10001);
        employee1.setDob(LocalDate.of(1998, 11, 22));
        employee1.setName("sumit kumar");

        employee2.setId(10001);
        employee2.setDob(LocalDate.of(1998, 11, 22));
        employee2.setName("sumit kumar");
    }

    @Test
    public void empTest1(){
        Assertions.assertEquals(10001, employee1.getId());
        Assertions.assertEquals(LocalDate.of(1998, 11, 22), employee1.getDob());
        Assertions.assertEquals("sumit kumar", employee1.getName());
    }

    @Test
    public void empTest2(){
        Assertions.assertEquals(employee1,employee2);

    }

}

package ru.nikita.spring.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
 ArrayList<Employee> employees = new ArrayList<Employee>();
    {
        employees.add(new Operator("Nikita",1222,2222));
        employees.add(new Operator("Nikita",1222,2222));
        employees.add(new Operator("Nikita",1222,2222));
    }
    Company company = new Company(employees);
    ArrayList<Employee> employees2 = new ArrayList<Employee>();
    {
        employees2.add(new Operator("Nikita",1222,2222));
        employees2.add(new Operator("Nikita",1222,2222));
        employees2.add(new Operator("Nikita",1222,2222));
    }
    Company company1 = new Company(employees);
    @Test
    void hire() {

    }
    Company company3 = new Company(employees);
    @Test
    void hireAll() {
    }

    @Test
    void fire() {
    }

    ArrayList<Employee> employees3 = new ArrayList<Employee>();
    {
        employees3.add(new Operator("Nikita",1222,2222));
        employees3.add(new Operator("Nikita",1222,2222));
        employees3.add(new Operator("Nikita",1222,2222));
    }
    @Test
    void getTopSalaryStaff() {
        assertEquals(employees,company.getTopSalaryStaff(3));
    }
    {
        employees3.add(new Operator("Nikita",1222,2222));
        employees3.add(new Operator("Nikita",1222,2222));
    }
    @Test
    void getLowestSalaryStaff() {
    }

    @Test
    void getIncome() {
    }
}
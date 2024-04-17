package ru.nikita.spring.company;

import java.util.Random;

public class TopManager extends Employee
{
    private double salary;
    public TopManager(String name,double salary)
    {
        super(name,salary*1.5);
        this.salary = salary;
    }
    @Override
    public double getMonthSalary()
    {
        if(salary + salary*0.05 < 0) throw new IllegalArgumentException("Salary is negative");
        return salary + salary*0.05;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
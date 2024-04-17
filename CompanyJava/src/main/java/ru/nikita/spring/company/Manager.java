package ru.nikita.spring.company;

import java.util.Random;

public class Manager extends Employee
{
    private double salary;
    public Manager(String name,double salary)
    {
        super(name,Math.random() * (140000 - 115000 + 1) + 115000);
        if(salary < 0) throw new IllegalArgumentException();
        this.salary = salary;
    }
    @Override
    public double getMonthSalary()
    {
        if(salary + (Math.random() * (140000 - 115000 + 1) + 115000)*0.05 < 0) throw new IllegalArgumentException();
        return salary + (Math.random() * (140000 - 115000 + 1) + 115000)*0.05;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

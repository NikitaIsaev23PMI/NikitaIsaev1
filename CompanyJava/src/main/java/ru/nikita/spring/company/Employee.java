package ru.nikita.spring.company;

public abstract class Employee
{
    private double income;
    private String name;
    public Employee(String name,double income)
    {
        this.income = income;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    public double getMonthSalary()
    {
        return 0;
    }
}

package ru.nikita.spring.company;

public class Operator extends Employee
{
    public double salary;
    public Operator(String name, double salary, double income)
    {
        super(name, income);
        this.salary = salary;
    }
    @Override
    public double getMonthSalary()
    {
        if(salary > 0) throw new IllegalArgumentException("illegal salary");
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative");
        this.salary = salary;
    }
}

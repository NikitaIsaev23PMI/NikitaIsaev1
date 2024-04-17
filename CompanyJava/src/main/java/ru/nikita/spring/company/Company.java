package ru.nikita.spring.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
    private List<Employee> employees = new ArrayList<>();
    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(List<Employee> newEmployees) {
        employees.addAll(newEmployees);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getMonthSalary(), e1.getMonthSalary()))
                .limit(count)
                .collect(Collectors.toList());

        return sortedEmployees;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getMonthSalary))
                .limit(count)
                .collect(Collectors.toList());

        return sortedEmployees;
    }

    public double getIncome() {
        double total = 0;
        for (Employee employee : employees) {
            total = total + employee.getIncome();
        }
        return total;
    }
}



package ru.nikita.spring.company;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager = new Manager("Nikita", -12222222);

    @org.junit.jupiter.api.Test
    void getMonthSalary() {

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            manager.getMonthSalary();
        });
    }
}
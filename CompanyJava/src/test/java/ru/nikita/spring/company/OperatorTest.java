package ru.nikita.spring.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {
Operator operator = new Operator("Nikita",-1221212,-1212);
    @Test
    void getMonthSalary()
    {
        {

            IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
                operator.getMonthSalary();
            });
        }
    }

}
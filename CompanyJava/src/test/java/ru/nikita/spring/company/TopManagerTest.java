package ru.nikita.spring.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopManagerTest {
TopManager manager = new TopManager("Nikita",-1222222222);
    @Test
    void getMonthSalary()
    {
        {

            IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
                manager.getMonthSalary();
            });
        }
    }
}
package ru.nikita.spring.abstracts;

import java.util.List;
import java.util.Scanner;

/**
 * @author Nikita Isaev
 * Интерфейс с единственным методом Intface
 */
public interface Intface {
    /**
     *
     * @param count
     * @param scanner
     * @return Лист из объектов БС
     */
    List<Bs> Vvesti(int count, Scanner scanner);

      // Сканер нужен для ввода
}

//public interface Intface {
//    void Vvesti(Bs[] array, int count);
//}
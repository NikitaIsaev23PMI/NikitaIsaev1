package ru.nikita.spring;

import ru.nikita.spring.abstracts.Abstract;
import ru.nikita.spring.abstracts.Bs;
import ru.nikita.spring.abstracts.Men;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * @author Nikita Isaev
 * Метод Main в котором я реализую методы из Bs,  в свою очередь методы из интерфейса Intface, Abctract
 */
public class Main {
    public static void main(String[] args) {
        List<Bs> list = new ArrayList<>();
        Bs bs  = new Bs();
        list.addAll(bs.Vvesti(4, new Scanner(System.in)));

        System.out.println(list); //просто вывожу введенный массив

        bs.Find(list.toArray(Bs[]::new),4, "Nikita" ); //реобразовываю лист в массив, т.k метод на вход ждет массив



        List<Bs> newBs =  list.stream()
                .sorted(Comparator.comparing(Bs::getName)).collect(Collectors.toList()); //Сортирую лист из объектов бс потом вывожу


        System.out.println(newBs);

    }
}




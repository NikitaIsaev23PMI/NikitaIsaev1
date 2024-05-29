package ru.nikita.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Исаев Никита
 * Исаев Никита 7 контрольная
 * 2 задание(5 вариант)
 */

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<String> listOfStrings = new ArrayList<String>();

        System.out.println("Введите кол-во строк которые вы хотите добавить в список");
        int countStr = in.nextInt();

        for (int i = 0; i < countStr; i++) {
            System.out.println("введите строку");
            String s = in.next();
            listOfStrings.add(s);
        }

        System.out.println("ведите букву при помощи которой хотите проверить строку");
        String s = in.next();
        String finalS = s.toLowerCase(); // привел букву к нижнему регистру для сравнения вне зависимости от регистра буквы
        long count =  listOfStrings.stream().filter(a -> {
            if(a.toLowerCase().indexOf(finalS) == 0){    // тут тоже привер саму строку в нижний регистр
                return true;
            }
            else {
                return false;
            }
        }).count();


        System.out.println("Кол-во строк начинающихся на букву "+ s + " равняется " + count);

    }
}
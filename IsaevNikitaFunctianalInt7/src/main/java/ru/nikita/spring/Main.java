package ru.nikita.spring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("111");
        strings.add("777");
        strings.add("555");
        strings.add("99999");
        strings.add("00000");

        SumComparator comparator = new SumComparator();
        Collections.sort(strings, comparator::compare);

        for (String str : strings) {
            System.out.println(str);
        }
    }
}



/*List   strings.add("abc123def45699999");
        strings.add("xyz789");
        strings.add("12345");

SumComparator comparator = new SumComparator();
        Collections.sort(strings, comparator);

        for (String str : strings) {
        System.out.println(str);
        }<String> strings = new ArrayList<>();*/

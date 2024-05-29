package ru.nikita.spring;

import java.util.Comparator;

public class SumComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int sum1 = getNumberSum(s1);
        int sum2 = getNumberSum(s2);
        return Integer.compare(sum1, sum2);
    }

    private int getNumberSum(String str) {

        int sum = 0;

        String[] numbers = str.split("\\D+");

        for (String number : numbers) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }
}
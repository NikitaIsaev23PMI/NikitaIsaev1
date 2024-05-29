package ru.nikita.spring;


import ru.nikita.spring.enums.Sex;
import ru.nikita.spring.enums.TypeOfPhoneNumber;
import ru.nikita.spring.models.Client;
import ru.nikita.spring.models.Number;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        numbers.add(new Number("+77058825504", TypeOfPhoneNumber.MOBILE));
        numbers.add(new Number("+77058634504", TypeOfPhoneNumber.STATIONARY));
        numbers.add(new Number("+776345825504", TypeOfPhoneNumber.MOBILE));
        numbers.add(new Number("+770588436304", TypeOfPhoneNumber.STATIONARY));
        numbers.add(new Number("+770588436304", TypeOfPhoneNumber.STATIONARY));

        clients.add(new Client(7, "Nikita", 18, numbers, Sex.MALE));

        List<Number> numbers2 = new ArrayList<>();
        numbers2.add(new Number("+77058825434", TypeOfPhoneNumber.MOBILE));
        numbers2.add(new Number("+77058634504", TypeOfPhoneNumber.MOBILE));
        numbers2.add(new Number("+776345825504", TypeOfPhoneNumber.MOBILE));
        numbers2.add(new Number("+770588436304", TypeOfPhoneNumber.MOBILE));
        numbers2.add(new Number("+770588436304", TypeOfPhoneNumber.MOBILE));

        clients.add(new Client(2, "Nastya", 78, numbers2, Sex.FEMALE));


        List<Number> numbers3 = new ArrayList<>();
        numbers3.add(new Number("+77058825434", TypeOfPhoneNumber.MOBILE));
        numbers3.add(new Number("+77058634504", TypeOfPhoneNumber.MOBILE));
        numbers3.add(new Number("+776345825504", TypeOfPhoneNumber.STATIONARY));
        numbers3.add(new Number("+770588436304", TypeOfPhoneNumber.MOBILE));
        numbers3.add(new Number("+770588436304", TypeOfPhoneNumber.MOBILE));

        clients.add(new Client(8, "Vova", 98, numbers3, Sex.MALE));

        List<Number> numbers4 = new ArrayList<>();
        numbers4.add(new Number("+77058825434", TypeOfPhoneNumber.STATIONARY));
        numbers4.add(new Number("+77058634504", TypeOfPhoneNumber.STATIONARY));
        numbers4.add(new Number("+776345825504", TypeOfPhoneNumber.STATIONARY));
        numbers4.add(new Number("+770588436304", TypeOfPhoneNumber.STATIONARY));
        numbers4.add(new Number("+770588436304", TypeOfPhoneNumber.STATIONARY));

        clients.add(new Client(5, "Tolya", 48, numbers4, Sex.MALE));

        System.out.println(clients.size());

        System.out.println(Client.getOldest(clients));

        System.out.println(Client.averageAge(clients));


        Client.allNumbersAge(clients);

        System.out.println(Client.oneFemale(clients));

        Client.MobilePeople(clients);

    }
}
package ru.nikita.spring.models;

import ru.nikita.spring.enums.Sex;
import ru.nikita.spring.enums.TypeOfPhoneNumber;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Client {

    private int id;

    private String name;

    private int age;

    private Sex sex;

    private List<Number> numbers;

    public Client(int id, String name, int age, List<Number> numbers, Sex sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.numbers = numbers;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Number> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Клиент " + name + " возрастом " + age + " список номеров " + numbers;
    }

    public static Client getOldest(List<Client> clients) {
        Optional<Client> oldestClient = clients.stream()
                .filter(client -> client.getNumbers().stream()
                        .anyMatch(number -> number.getTypeOfPhoneNumber().equals(TypeOfPhoneNumber.STATIONARY)))
                .max(Comparator.comparingInt(Client::getAge));
        return oldestClient.get();
    }

    public static double averageAge(List<Client> clients) {
        double result = clients.stream()
                .filter(client -> client.getNumbers().stream()
                        .allMatch(number -> number.getTypeOfPhoneNumber().equals(TypeOfPhoneNumber.STATIONARY)))
                .mapToInt(Client::getAge).average().orElse(0);
        return result;
    }

    public static void MobilePeople(List<Client> clients) {
        clients.stream()
                .filter(client -> client.getNumbers()
                        .stream().anyMatch(number -> number.getTypeOfPhoneNumber()
                                .equals(TypeOfPhoneNumber.MOBILE)) && client.getAge() > 18)
                .forEach(System.out::println);
    }

    public static boolean oneFemale(List<Client> clients) {
        return clients.stream().anyMatch(client -> client.getSex().equals(Sex.FEMALE) && client.getAge() > 60);
    }

    public static void allNumbersAge(List<Client> clients) {
        clients.stream().sorted(Comparator.comparingInt(Client::getAge))
                .forEach(a -> System.out.println(a.getName() + " номера человека " + a.getNumbers()));
    }

    public static void allNumbersName(List<Client> clients) {
        clients.stream().sorted(Comparator.comparing(Client::getName))
                .forEach(a -> System.out.println(a.getName() + " номера человека " + a.getNumbers()));
    }

}

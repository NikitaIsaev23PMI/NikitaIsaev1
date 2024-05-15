package ru.nikita.spring.abstracts;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Bs extends Abstract implements Intface{

    private String Name;

    public String getName() {
        return Name;
    }

    public Bs(){

    }

    public void setName(String name) {
        Name = name;
    }

    public Bs(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Bs{" +
                "Name='" + Name + '\'' +
                '}';
    }


    //    @Override
//    public void Find(Bs[] array, int count, String person) {
//        for (int i = 0; i < count; i++) {
//            if (array[i].getName().equals(person)) {
//                System.out.println("Фамилия: " + person + ", порядковый номер: " + i);
//                return;
//            }
//        }
//        System.out.println("Такого человека нет");
//    }

    /**
     *
     * @param array
     * @param count
     * @param personName
     * Метод ищет человека по имени и в в зависимости от того присутствует ли данный человек в переданном массиве возвращает строку
     */
    @Override
    public void Find(Bs[] array, int count,String personName) {
        for (int i = 0; i < count; i++) {
            if (array[i].getName().equals(personName)) {
                System.out.println("Фамилия: " + personName + ", порядковый номер: " + i + 1);
                return;
            }
        }
        System.out.println("Такого человека нет");
    }

    /**
     * переопределил метод для сравнения
     * @return Булевое значение равны ли объекты или нет
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bs bs = (Bs) o;
        return Objects.equals(getName(), bs.getName());
    }

    /**
     *
     * @param count
     * @param scanner
     * @return возвращает массив  из Bs имя которым мы сами вводим, так же этот метод создает и записывает массив в файл под названием ArrayOfBs.txt
     */
    public List<Bs> Vvesti(int count, Scanner scanner) {
        if (count <= 0) {
            throw new IllegalArgumentException("Неверно указан размер");
        }

        List<Bs> bs = new ArrayList<Bs>();
        for (int i = 0; i < count; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя для объекта Bs:");
            String otdel = in.nextLine();
            bs.add(new Bs(otdel));
        }
        List<String> forFile = bs.stream().map(a -> a.toString()).toList();

        Path pathToFile = Paths.get("ArrayOfBs.txt");
        try {
            Files.write(pathToFile, forFile, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bs;
    }

    /**
     * переопределил метод
     * @return цоле число
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}






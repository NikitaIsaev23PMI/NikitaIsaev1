package ru.nikita.spring.abstracts;

/**
 * Астрактный класс с единственным методом Find
 * @author Nikita Isaev
 * */
public abstract class Abstract {
    /**
     *
     * @param array
     * @param count
     * @param personName
     * Метод ищет человека по имени и в в зависимости от того присутствует ли данный человек в переданном массиве возвращает строку
     */
    public abstract void Find(Bs[] array, int count, String personName);
}

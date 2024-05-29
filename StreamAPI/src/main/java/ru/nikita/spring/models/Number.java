package ru.nikita.spring.models;

import ru.nikita.spring.enums.TypeOfPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Number {

    private String number;

    private TypeOfPhoneNumber typeOfPhoneNumber;

    public Number(String number, TypeOfPhoneNumber typeOfPhoneNumber) {
        this.number = number;
        this.typeOfPhoneNumber = typeOfPhoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public TypeOfPhoneNumber getTypeOfPhoneNumber() {
        return typeOfPhoneNumber;
    }

    public void setTypeOfPhoneNumber(TypeOfPhoneNumber typeOfPhoneNumber) {
        this.typeOfPhoneNumber = typeOfPhoneNumber;
    }

    @Override
    public String toString() {
        return "номер " + this.number;
    }

}

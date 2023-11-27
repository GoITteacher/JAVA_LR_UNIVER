package org.example;

public class Human {
    String firstName;
    String lastName;
    String patronymic;
    Sex sex;

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }
}

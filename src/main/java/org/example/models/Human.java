package org.example.models;

public class Human {
    public String firstName;
    public String lastName;
    String patronymic;
    Sex sex;

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }
}

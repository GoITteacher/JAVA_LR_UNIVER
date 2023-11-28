package org.example.models;

public class Student extends Human {
    String studentId;

    public Student(String firstName, String lastName, String patronymic, Sex sex, String studentId) {
        super(firstName, lastName, patronymic, sex);
        this.studentId = studentId;
    }
}
package org.example.controllers;

import org.example.models.*;

public class UniversityManager implements UniversityCreator, FacultyCreator, DepartmentCreator, GroupCreator, StudentCreator {

    @Override
    public University createUniversity(String name, Human head) {
        return new University(name, head);
    }

    @Override
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }

    @Override
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }

    @Override
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }

    @Override
    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex, String studentId) {
        return new Student(firstName, lastName, patronymic, sex, studentId);
    }
}
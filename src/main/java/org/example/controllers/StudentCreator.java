package org.example.controllers;

import org.example.models.Sex;
import org.example.models.Student;

public interface StudentCreator {
    Student createStudent(String firstName, String lastName, String patronymic, Sex sex, String studentId);
}

package org.example.controllers;
import org.example.models.Department;
import org.example.models.Human;

public interface DepartmentCreator {
    Department createDepartment(String name, Human head);
}

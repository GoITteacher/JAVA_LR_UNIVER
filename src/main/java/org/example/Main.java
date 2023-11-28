package org.example;


import org.example.controllers.UniversityManager;
import org.example.models.*;

public class Main {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    public static void createTypicalUniversity() {
        UniversityManager manager = new UniversityManager();

        // Create University
        University university = manager.createUniversity("Sample University", new Human("John", "Doe", "", Sex.MALE));

        // Create Faculty
        Faculty faculty = manager.createFaculty("Engineering", new Human("Jane", "Smith", "", Sex.FEMALE));

        // Create Department
        Department department = manager.createDepartment("Computer Science", new Human("Bob", "Johnson", "", Sex.MALE));

        // Create Group
        Group group = manager.createGroup("CS101", new Human("Alice", "Brown", "", Sex.FEMALE));

        // Create Student
        Student student = manager.createStudent("Mark", "Taylor", "", Sex.MALE, "123456");

        // Output
        System.out.println("University: " + university.name);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Department: " + department.name);
        System.out.println("Group: " + group.name);
        System.out.println("Student: " + student.firstName + " " + student.lastName);
    }
}